import java.util.*;

class Job {
    int id, dead, profit;

    Job(int id, int dead, int profit) {
        this.id = id;
        this.dead = dead;
        this.profit = profit;
    }
}

class Solution {

    static int[] parent;

    static int find(int s) {
        if (parent[s] == s)
            return s;
        return parent[s] = find(parent[s]); // path compression
    }

    static void union(int u, int v) {
        parent[u] = v;
    }

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;

        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Job(i, deadline[i], profit[i]);
        }

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (int d : deadline)
            maxDeadline = Math.max(maxDeadline, d);

        parent = new int[maxDeadline + 1];

        for (int i = 0; i <= maxDeadline; i++)
            parent[i] = i;

        int countJobs = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {

            int availableSlot = find(arr[i].dead);

            if (availableSlot > 0) {
                countJobs++;
                totalProfit += arr[i].profit;

                union(availableSlot, find(availableSlot - 1));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(countJobs);
        result.add(totalProfit);

        return result;
    }
}
