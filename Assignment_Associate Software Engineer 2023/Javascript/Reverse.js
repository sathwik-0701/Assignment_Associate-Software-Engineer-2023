
const userInput = prompt("Enter a sentence:");

if (userInput !== null && userInput.trim() !== "")
 {
    const words = userInput.split(" ");
    const reversedWords = [];
       for (const word of words) 
       {
        const reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }
    const reversedSentence = reversedWords.join(" ");

    console.log("Reversed Sentence: " + reversedSentence);
    } else 
    {
    console.log("Please enter a valid sentence.");
}

function reverseWord(word) 
{
    return word.split("").reverse().join("");
}
