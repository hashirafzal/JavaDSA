package array;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> listOfint = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for(int n:nums1) h1.add(n);
        for(int m:nums2) h2.add(m);

        for(int n: nums1)
        {
            if(h2.contains(n))
            {
                h1.remove(n);
                h2.remove(n);
            }
        }

        listOfint.add(new ArrayList<>(h1));
        listOfint.add(new ArrayList<>(h2));
        return listOfint;
    }

}
