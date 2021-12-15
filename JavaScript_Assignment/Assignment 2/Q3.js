const isEven = (num) => num % 2 == 0;
const isOdd = (num) => num % 2 != 0;
function find(arr, f) {
  var ele;
  for (let i = 0; i < arr.length; i++) {
    if (f(arr[i])) {
      ele = arr[i];
      break;
    }
  }
  return ele;
}
find([1, 2, 3, 4, 6], isOdd);
find([1, 2, 3, 4, 6], isEven);