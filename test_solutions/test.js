function example5(size) {
	var array = [];
	for (var i = 0; i < size; i++) {
		for (var j = 0; j < size; j++) {
			if (array[i] === undefined) array[i] = [];
			array[i][j] = 0;
		}
	}
	for (var k = 0; k < size; k++) {
		array[k][k] = 1;
		array[k][size - k - 1] = 1;
	}
	return array;
}

function printArray(array) {
	for (var i = 0; i < array.length; i++) {
		console.log((i % 10) + ": " + array[i].join(" "));
	}
}

function example6() {
	return {
		"alphabet": ["A", "B", "C", "D", "E", "F"],
		"name": "orákulum",
		"sum": 6
	};
}

function example7(object) {
	console.log("VSTUPNÍ OBJEKT: ", object);

	for (var i = 0; i < object.alphabet.length; i++) {
		console.log(object.alphabet[i]);
	}
	console.log(object.name);
	console.log(object.sum);
}
console.log("");
console.log("");
console.log("");
console.log("");
console.log("");
console.log("PŘÍKLAD 5");
printArray(example5(10));
console.log("=======================");
console.log("PŘÍKLAD 6");
console.log(example6());
console.log("=======================");
console.log("PŘÍKLAD 5");
example7(example6());