//class in js implemented using arrow functionsconst person1={
    fname:"monk",
    lname:"pan",
    add:575007,
    hello:()=>{
        console.log("good morning")
    }

}
const person2={
    fname:"pokie",
    lname:"timpy",
    add:675543,
    hello:()=>{
        console.log("good evening")},
    

}
console.log(person1.fname);
console.log(person2.add)
person1.hello();
person2.hello()
