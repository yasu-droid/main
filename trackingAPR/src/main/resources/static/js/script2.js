/**
 * DOM要素を取得して変数に代入します。
 * "listShift" および "timerShift" のDOM要素を取得します。
 */
var listShift = document.getElementById("listShift");
var timerShift = document.getElementById("timerShift");

/**
 * "changeColor" クラスを持つ要素に対して、クリックイベントを追加します。
 * クリックされた要素の背景色を赤色にし、それ以外の要素の背景色を青色にします。
 */
const changeColor = document.getElementsByClassName("changeColor");
for (let i = 0; i < changeColor.length; i++) {
	changeColor[i].addEventListener("click", () => {
		for (let j = 0; j < changeColor.length; j++) {
			if (i === j) {
				changeColor[j].style.backgroundColor = "red";
			} else {
				changeColor[j].style.backgroundColor = "blue";
			}
		}
	});
}

// 数字の受け取り

// 集中モードの時間をセッションストレージから取得します。
let storedNumber = parseInt(sessionStorage.getItem('inputNumber'));
// もし取得した値が数値でない場合、デフォルト値として25を設定します。
if (isNaN(storedNumber)) {
	storedNumber = 25; // デフォルト値を設定する場合
}

// 小休憩モードの時間をセッションストレージから取得します。
let breakStoredNumber = parseInt(sessionStorage.getItem('breakInputNumber'));
// もし取得した値が数値でない場合、デフォルト値として5を設定します。
if (isNaN(breakStoredNumber)) {
	breakStoredNumber = 5; // デフォルト値を設定する場合
}

// アコーディオンメニューの表示

// "accordion" クラスを持つ要素に対して、クリックイベントを追加します。
// クリックされた要素の次の要素の表示/非表示を切り替えます。
var accordion = document.getElementsByClassName("accordion");
for (let i = 0; i < accordion.length; i++) {
	accordion[i].addEventListener("click", function() {
		this.classList.toggle("active");
		var panel = this.nextElementSibling;
		if (panel.style.display === "block") {
			panel.style.display = "none";
		} else {
			panel.style.display = "block";
		}
	});
}


// 集中モードの時間を設定するボタンにクリックイベントを追加します。
document.getElementById("setConcentrationTime").addEventListener("click", function() {
	var concentrationMinutes = document.getElementById("concentrationMinutes").value;
	minutes1 = concentrationMinutes;
	document.getElementById("countdown1").innerHTML = pad(minutes1) + ":00";

	// 新しい値をsessionStorageに保存して更新する
	sessionStorage.setItem('inputNumber', concentrationMinutes);
});
// 小休憩モードの時間を設定するボタンにクリックイベントを追加します。
document.getElementById("setBreakTime").addEventListener("click", function() {
	var breakMinutes = document.getElementById("breakMinutes").value;
	minutes2 = breakMinutes;
	document.getElementById("countdown2").innerHTML = pad(minutes2) + ":00";

	// 新しい値をsessionStorageに保存して更新する
	sessionStorage.setItem('breakInputNumber', breakMinutes);
});

// ポモドーロタイマーのjs
// タイマー1（集中モード）の間隔ID
let countdownInterval1;
// タイマー2（休憩モード）の間隔ID
let countdownInterval2;

// タイマー1の初期設定（25分）
let minutes1 = 25;
let seconds1 = 0;
// タイマー2の初期設定（5分）
let minutes2 = 5;
let seconds2 = 0;

// タイマー1の実行状態
let isTimerRunning1 = false;
// タイマー2の実行状態
let isTimerRunning2 = false;

// タイマー1（集中モード）のスタート/ストップボタンのクリックイベント
document.getElementById("startStopButton1").addEventListener("click", function() {
	toggleTimer("concentrationTimer");
	startStopTimer1();
});
// タイマー2（休憩モード）のスタート/ストップボタンのクリックイベント
document.getElementById("startStopButton2").addEventListener("click", function() {
	toggleTimer("breakTimer");
	startStopTimer2();
});

// 集中モードの入力フィールドの値が変更された際のイベント
document.getElementById("minutesInput1").addEventListener("input", function() {
	let value = parseInt(this.value);
	// 入力値が無効な場合はデフォルト値を設定（25分）
	if (isNaN(value) || value < 1) {
		this.value = 25;
	} else if (value > 99) {
		this.value = 99;
	}
	minutes1 = this.value;
	document.getElementById("countdown1").innerHTML = pad(minutes1) + ":00";

	// 新しい値をsessionStorageに保存して更新する
	sessionStorage.setItem('inputNumber', minutes1);
});

// 休憩モードの入力フィールドの値が変更された際のイベント
document.getElementById("minutesInput2").addEventListener("input", function() {
	let value = parseInt(this.value);
	// 入力値が無効な場合はデフォルト値を設定（5分）
	if (isNaN(value) || value < 1) {
		this.value = 5;
	} else if (value > 99) {
		this.value = 99;
	}
	minutes2 = this.value;
	document.getElementById("countdown2").innerHTML = pad(minutes2) + ":00";

	// 新しい値をsessionStorageに保存して更新する
	sessionStorage.setItem('breakInputNumber', minutes2);

	// 休憩モードの時間を設定の時間に戻す
	breakStoredNumber = minutes2;
	seconds2 = 0;

	// リセット後、集中モードのタイマーの表示を設定した数に更新
	document.getElementById("countdown1").innerHTML = pad(storedNumber) + ":00";
});

function startStopTimer1() {
	if (isTimerRunning1) {
		clearInterval(countdownInterval1);
		document.getElementById("startStopButton1").innerHTML = "スタート";
		isTimerRunning1 = false;
	} else {
		countdownInterval1 = setInterval(function() {
			document.getElementById("countdown1").innerHTML = pad(minutes1) + ":" + pad(seconds1);
			if (seconds1 >= 1) {
				--seconds1;
			} else if (minutes1 > 0) {
				seconds1 = 59;
				minutes1--;
			} else if (minutes1 === 0 && seconds1 === 0) {
				seconds1 = 0;
				clearInterval(countdownInterval1);
				alert("集中時間が終了しました！");
				toggleMode("break");
				toggleTimer("breakTimer");
				startStopTimer2(); // 休憩モードのタイマーを開始する
				minutes1 = storedNumber;
			}
			document.getElementById("countdown1").innerHTML = pad(minutes1) + ":" + pad(seconds1);
		}, 1000);
		document.getElementById("startStopButton1").innerHTML = "ストップ";
		isTimerRunning1 = true;
	}

	// タイマー1（集中モード）の終了ボタンのクリックイベント
	document.getElementById("endButton1").addEventListener("click", function() {
		clearInterval(countdownInterval1);
		document.getElementById("countdown1").innerHTML = pad(storedNumber) + ":00"; // 設定した数字に更新
		document.getElementById("startStopButton1").innerHTML = "スタート";
		isTimerRunning1 = false;

		// 休憩モードに移行する
		toggleMode("break");
		toggleTimer("breakTimer");
		seconds1 = 0; // 秒数もリセットする
		minutes1 = storedNumber; // 集中モードの時間を設定の時間に戻す
	});
}
// タイマー2（休憩モード）のスタート/ストップボタンの処理
function startStopTimer2() {
	if (isTimerRunning2) {
		clearInterval(countdownInterval2);
		document.getElementById("startStopButton2").innerHTML = "スタート";
		isTimerRunning2 = false;
	} else {
		countdownInterval2 = setInterval(function() {
			document.getElementById("countdown2").innerHTML = pad(minutes2) + ":" + pad(seconds2);
			if (seconds2 >= 1) {
				--seconds2;
			} else if (minutes2 > 0) {
				seconds2 = 59;
				minutes2--;
				// タイマーの数字を設定の数字に戻す
			} else if (minutes2 === 0 && seconds2 === 0) {
				seconds2 = 0;
				clearInterval(countdownInterval2);
				alert("休憩時間が終了しました！");
				toggleMode("concentration");
				toggleTimer("concentrationTimer");
				startStopTimer1(); // 集中モードのタイマーを開始する
				minutes2 = breakStoredNumber;
			}
			document.getElementById("countdown2").innerHTML = pad(minutes2) + ":" + pad(seconds2);
		}, 1000);
		document.getElementById("startStopButton2").innerHTML = "ストップ";
		isTimerRunning2 = true;
	}
	// タイマー2（休憩モード）の終了ボタンのクリックイベント
	document.getElementById("endButton2").addEventListener("click", function() {
		clearInterval(countdownInterval2);
		document.getElementById("countdown2").innerHTML = pad(breakStoredNumber) + ":00"; // 設定した数字に更新
		document.getElementById("startStopButton2").innerHTML = "スタート";
		isTimerRunning2 = false;

		// 集中モードに移行する
		toggleMode("concentration");
		toggleTimer("concentrationTimer");
		minutes2 = breakStoredNumber; // 休憩モードの時間を設定の時間に戻す
		seconds2 = 0; // 秒数もリセットする
		
		// 集中モードで測った時間を計算
		let concentrationMinutesPassed = 25 - minutes1;
		let concentrationSecondsPassed = 60 - seconds1;

		// 休憩モードで測った時間を計算
		let breakMinutesPassed = minutes2;
		let breakSecondsPassed = 60 - seconds2;

		// コンソールに集中モードで測った時間を表示
		console.log("集中モードで測った時間: " + concentrationMinutesPassed + "分 " + concentrationSecondsPassed + "秒");

		// コンソールに休憩モードで測った時間を表示
		console.log("休憩モードで測った時間: " + breakMinutesPassed + "分 " + breakSecondsPassed + "秒");
	});

}

// 集中モードまたは休憩モードの切り替え
function toggleMode(mode) {
	if (mode === "concentration") {
		document.getElementById("concentrationTimer").classList.add("active");
		document.getElementById("breakTimer").classList.remove("active");
	} else if (mode === "break") {
		document.getElementById("concentrationTimer").classList.remove("active");
		document.getElementById("breakTimer").classList.add("active");
	}
}

// タイマー表示を切り替える
function toggleTimer(timerId) {
	let timerContainers = document.querySelectorAll(".timer-container");
	timerContainers.forEach(function(timerContainer) {
		if (timerContainer.id === timerId) {
			timerContainer.classList.add("active");
		} else {
			timerContainer.classList.remove("active");
		}
	});
}

// 数値を2桁の文字列に整形する関数です。
// 例えば、10未満の数値の場合は先頭に0を付け加えます。
function pad(val) {
	return val > 9 ? val : "0" + val;
}