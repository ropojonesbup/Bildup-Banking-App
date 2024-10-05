
// import * as readline from 'readline'
console.clear();
// beep(440, 500);
console.log("******************");
console.log("Welcome to SEAP-Fi");
console.log("******************");
console.log("");

console.log(`Please select an option:\n 
    1. Onboard customer.\n 
    2. Open customer account.\n 
    3. Deposit to customer account.\n
    4. Widthdraw from customer account.\n 
    5. Transfer to other accounts.\n 
    6. Close an account.\n 
    7. Exit application.\n
    `);

console.log("");
console.log("option:");
console.log("");
console.log("");

// function beep(frequency: number, duration: number): void {
//     // Create an AudioContext instance 
//     const audioContext = new (window.AudioContext || (window as any).webkitAudioContext)();
//     // Create an oscillator node (to generate sound) 
//     const oscillator = audioContext.createOscillator(); const gainNode = audioContext.createGain();
//     // Set oscillator frequency (pitch) 
//     oscillator.frequency.value = frequency;
//     // Connect the oscillator to the gain node (volume control) 
//     oscillator.connect(gainNode);
//     // Connect the gain node to the AudioContext destination (speakers) 
//     gainNode.connect(audioContext.destination);
//     // Start the oscillator 
//     oscillator.start();
//     // Stop the sound after the specified duration 
//     setTimeout(() => {
//         oscillator.stop();
//         audioContext.close();

//     }, duration);
// }

// Usage example: Beep at 440 Hz for 500 milliseconds beep(440, 500);

// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout
// });

// rl.question(`Please select an option\n
//     1. Customer account and creation\n
//     2. Account opening\n
//     3. Deposit to account\n
//     4. Widthdrawal from account\n
//     5. Transfer to other accounts\n
//     6. Account closing\n
//     7. View all Transactions\n`, (answer: string) => {
//   console.log(`${answer}!`);

//   // Close the readline interface
//   rl.close();
// }); 
