// if( 5== 5){
//     var message='equal';

// }
// console.log(message);
// (function(){
//     console.log('in function');
// })();
let app = (function(){ //closures..
    let carId=123;
    let getId= function(){
        return carId;
    };
    return{
        getId: getId
    };

})();
console.log(app.getId());

// let app = ( function () {
//     let carId = 123;
//     let getId = function() {
//         return carId;
//     };
//     return {
//         getId: getId
//     };
// })();
// console.log( app. getId() );

let fn=function(){
    console.log(this==wimdpw); // this keyword

}
fn();
//call and apply;

