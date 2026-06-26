class Solution {
    public int wateringPlants(int[] plants, int capacity) {

        int n = plants.length;
        int steps = 0;
        int maxCapacity = capacity;

        for (int i = 0; i < n; i++) {

            if (capacity < plants[i]) {
                steps = steps + (2 * i);
                capacity = maxCapacity;
            }

            steps++;
            capacity = capacity - plants[i];
        }

        return steps;
    }
}