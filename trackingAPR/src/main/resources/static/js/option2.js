		document.getElementById("timerSettingsForm").addEventListener("submit", function (event) {
			event.preventDefault(); // デフォルトのフォーム送信を防止

			// 入力された時間を取得
			const concentrationTime = document.getElementById("concentrationTime").value;
			const breakTime = document.getElementById("breakTime").value;

			// ローカルストレージに保存
			localStorage.setItem("concentrationTime", concentrationTime);
			localStorage.setItem("breakTime", breakTime);

			alert("設定が完了しました！");

			// index.htmlにリダイレクト
			location.href = 'http://localhost:8080/';
		});