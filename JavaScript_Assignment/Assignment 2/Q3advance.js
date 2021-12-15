const square = num => num*num;
function find(arr, f) {
    var ele = [];
    for (let i = 0; i < arr.length; i++) {
        ele[i] = f(arr[i]);
    }
    return ele;
}


"My find() conatins this: " + find;