
import java.util.Random;

public class ArrayShuffler 
{
    public static void main(String[] args) 
{
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(array);

        
        for (int element : array) 
        {
            System.out.print(element + " ");
        }
    }

    public static void shuffleArray(int[] array) 
      {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) 
         {
            int randomIndex = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}


