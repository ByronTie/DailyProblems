/*
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
var arr = [1, 2, 3, 4, 5];

//O(2n)
function arrayProducts(arr) {
    let totalProduct = 1;
    let arrProducts = [];
    
    arr.forEach(value => {
        totalProduct *= value;
    });

    arr.forEach(value => {
        arrProducts.push(totalProduct/value);
    });

    return arrProducts;
}

console.log(arrayProducts(arr));

//O(2n^2))
function arrayProducts_2(arr) {
    let arrProducts = [];
    
    arr.forEach(value => {
        let product = 1;
        arr
            .filter(val => val !== value)
            .forEach(val => {
                product *= val;
            });

        arrProducts.push(product);
    });

    return arrProducts;
}

console.log(arrayProducts_2(arr));