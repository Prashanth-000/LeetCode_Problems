//return only even numbers from the given list of arrays using JS
const num=[1,2,3,4,5,6,10];
const even_num=num.filter(iseven);
console.log(even_num);

function iseven(element){
    if (element%2===0){
        return 1;
    }
    else{
        return 0;
    }
}
