import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);

        int count = 0;
        int greedIndex = 0;
        int sizeIndex = 0;

        while (greedIndex < greed.length && sizeIndex < size.length) {
            if (greed[greedIndex] <= size[sizeIndex]) {
                greedIndex++;
                count++;
            }
            sizeIndex++;
        }
        return count;
    }
}