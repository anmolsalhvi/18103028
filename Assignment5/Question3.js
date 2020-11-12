<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<!-- <pre> -->
<script>
var map = {
    "(": ")",
    "[": "]",
    "{": "}"
  }
var isValid = (s) => {
var stack = [];
//a stack is a data structure that supports 3 operations: adding to the stack, removing from the stack, displaying the stack
//a basic stack is implemented using a ‘last in, first out’ approach.
for (var i = 0; i < s.length; i++) {
    var item = s[i];
    //item is a variable whose value is the element at position i of    the string
    if (map[item]) {
    //if item is a value, add that value i.e. ‘}’ to the stack
        stack.push(map[item]);
    } else {
    if (item !== stack.pop()) {
    //if item is not equal to the first element of the stack return false
        return false;
    }
    }
}
//return the stack when its elements have been exhausted
return stack.length === 0;
};

s = prompt("input string", "{[}]")
document.write(isValid(s));

</script>
<!-- </pre> -->
</body>
</html>
