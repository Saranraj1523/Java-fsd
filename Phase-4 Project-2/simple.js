// function startCar ( carId ) {
//     let message  = 'Starting...';
//     let startFn = function turnKey() {
//         console.log(message); // 'Starting...'
//     };
//     startFn();
// }
function startCar ( carId ) {
    let message  = 'Starting...';
    let startFn = function turnKey() {
        let message='override';
        };
    startFn();
    console.log(message); // 'Starting...'
}
startCar(123);
