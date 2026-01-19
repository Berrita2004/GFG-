class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
            int n = a.length;
    int m = b.length;

    Arrays.sort(a);
    Arrays.sort(b);

    PriorityQueue<int[]> pq = new PriorityQueue<>(
        (x, y) -> y[0] - x[0]   // compare by sum desc
    );

    Set<String> vis = new HashSet<>();
    ArrayList<Integer> ans = new ArrayList<>();

    int i = n - 1;
    int j = m - 1;

    pq.add(new int[]{a[i] + b[j], i, j});
    vis.add(i + "@" + j);

    while (k-- > 0 && !pq.isEmpty()) {

        int[] cur = pq.poll();
        int sum = cur[0];
        int x = cur[1];
        int y = cur[2];

        ans.add(sum);

        if (x - 1 >= 0) {
            String key = (x - 1) + "@" + y;
            if (!vis.contains(key)) {
                pq.add(new int[]{a[x - 1] + b[y], x - 1, y});
                vis.add(key);
            }
        }

        if (y - 1 >= 0) {
            String key = x + "@" + (y - 1);
            if (!vis.contains(key)) {
                pq.add(new int[]{a[x] + b[y - 1], x, y - 1});
                vis.add(key);
            }
        }
    }

    return ans;
}

    
}