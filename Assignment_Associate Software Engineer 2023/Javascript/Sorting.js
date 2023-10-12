
const userInput = prompt('Enter numbers separated by commas:');
const inputArray = userInput.split(',').map(Number);

if (inputArray.some(isNaN)) 
{
  console.log('Invalid input. Please enter numbers separated by commas.');
}
 else
  {
  inputArray.sort((a, b) => b - a);
  console.log('Sorted Descending Array:', inputArray);
}
