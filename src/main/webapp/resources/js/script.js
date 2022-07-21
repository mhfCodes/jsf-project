(function() {
	
	const input = document.getElementById("j_idt6:weight").value;
	const form = document.querySelector(".form");
	let result = 0;
	
	form.addEventListener("submit", (e) => {
		e.preventDefault();
		console.log(e);
		result = input.value * 0.45359237;
		
	})
	
	document.getElementById("result").textContent = result;
})();
