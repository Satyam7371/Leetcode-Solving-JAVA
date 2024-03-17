import java.util.ArrayList;
class Satyam {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<m && j<n) {
            if((i<m && j<n) && (nums1[i]<=nums2[j])) {
                list1.add(nums1[i]);
                i++;
                }
            else {
                    list1.add(nums2[j]);
                    j++;
                }
        }
        while(i<m) {
            list1.add(nums1[i]);
            i++;
        }
        while(j<n) {
            list1.add(nums2[j]);
            j++;
        }
        for(int k=0;k<list1.size();k++) {
            nums1[k] = list1.get(k);
        }
    }
}
