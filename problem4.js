const testArr1 = [3, 4, -1 , 1];
const testArr2 = [1, 2, 0];
const testArr3 = [0, 0, 1, 2, 2, 3];

function findLowestPositive(inputArr) {
    let positiveArr = [...new Set(inputArr)] //remove duplicates
        .filter(x => x > 0) //remove negative numbers
        .sort();

    let largestNumber = positiveArr[positiveArr.length - 1];
    console.log(positiveArr, largestNumber);

    if (largestNumber === positiveArr.length) {
        return ++largestNumber;
    } else {
        for(let i = 0; i < largestNumber; i++) {
            let currentLargest = i+1;
            if(positiveArr[i] !== currentLargest) {
                return currentLargest;
            }
        }
    }
}
