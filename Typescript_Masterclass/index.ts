//symbolss
// // let id:symbol=Symbol(1234)
// // console.log(id);

// // let user={

// //     [id]:"786",
// //     name:"emp1",

// //     getId()
// //     {
// //         return this[id];
// //     }


// // }
// // console.log(user.getId())

//primitive types
// let message:string = "Hello, TypeScript!";
// let age:number = 42;
// let isStudent:boolean = true;
// let fetched:null = null;
// let user:undefined = undefined;
// let largeNumber:bigint = 9007199254740991n;
// let unique:symbol = Symbol("uniqueSymbol");

// function name9(param:any)
// {
//     return param;
// }

// console.log(typeof age==message);

//type alias
// type customstring=string;
// let name:customstring="mark"


//null vs undefined
// let abc;
// let dca:null;
// dca=null
// console.log(abc)
// //abc="kkl"
// if(!dca)
// {
//     console.log(typeof(abc))

// }


//union types
// let abc :string|number|boolean;
// abc=true
// abc=1234
// abc="ikloh"
// console.log(abc)

//conditional types
// type customstring=string
// type customeDate=Date

// type TFvariable= customstring extends string ? true :false
// let fv:TFvariable=true
// console.log(typeof fv)

//here we are creating a new type (not value) based on the ternary condition
//so here the TFvaribale is datatype which is of boolean type but is only true , due to the ternary condition we provided.



// let sarray:number[]=[1,2,3,4]
// for(let i of sarray)
// {

//     console.log(i)
// }

//type casting
// let dname="89" as any
// let num =dname as number
// console.log(typeof dname)
// console.log(typeof dname== typeof num)

//excercise
// let city = "New York"; // string
// let population = 8400000;//number
// const age = 32;//since const keyword is used age is now a constant with a literal value 32
// let oldAge = 79 as const;//literal 79
// let newAge = oldAge;//79
// let data = new Map();//Map<>
// let score = [90, 86, 100];//number[]
// type Primitive = string | number | boolean;//any of the three
// type CustomName = "John" extends string ? string : "John"; //string
// type CustomAge = typeof newAge extends number ? 79 : number;//79
// type CheckData = typeof data extends Object ? true : false;//true
// type CheckScore = typeof score extends never ? {} : [];//[]

// /**
//  * Are the following statements valid
//  * Check if below lines of code are valid as per TypeScript or not without uncommenting them
//  *  */

//  age = 85;//not
//  score.push(10);//valid
//  score.push("New Score");//not
//  let customAge: CustomAge = 50;// not
//  let primitive: Primitive = new Date();//not
//  let years: CheckScore = [];//valid

const names: string[]=["basith","sudeep","jayesh","chaithanya","chethan"];
const marks:number[]=[90,85,80,75,70];


console.log('names and marks:')
for(let i=0;i<names.length;i++)
{
    console.log(`${names[i]}:${marks[i]}`);
}

export function findavg(marks:number[]):number{
    let sum=marks.reduce((acc,val)=>acc+val,0);
    const avg=sum/marks.length;
    console.log(`average marks:${avg}`);
    return avg;
}
findavg(marks);

