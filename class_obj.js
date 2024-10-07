//classes and object in JS
class student{
    constructor(name,age,sec){
        this.name=name;
        this.age=age;
        this.sec=sec;
    }
    display() {
        console.log(`Name:${this.name}`);
        console.log(`Age:${this.age}`);
        console.log(`Section:${this.sec}`);
    }
}

const s1=new student("prash",20,'5c');
const s2=new student("tomy",33,"3d");
const s3=new student("mark",45,"2a");
s1.display();
s2.display();
s3.display();
