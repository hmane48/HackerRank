package AmazonPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {


        // sample input
        System.out.println(getIdPairsForOptimal(10,
                Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 5), Arrays.asList(3, 7), Arrays.asList(4, 1)),
                Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 9), Arrays.asList(3, 5))));
    }

    public static List<List<Integer>> getIdPairsForOptimal(int maxDistance, List<List<Integer>> forwardList,
                                                           List<List<Integer>> backwardList) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        forwardList = forwardList.stream().sorted((x1, x2) -> Integer.compare(x2.get(1), x1.get(1)))
                .collect(Collectors.toList());
        backwardList = backwardList.stream().sorted((x1, x2) -> Integer.compare(x1.get(1), x2.get(1)))
                .collect(Collectors.toList());
        int maxDist = maxDistance;
        while (true) {
            for (List<Integer> l : forwardList) {
                for (List<Integer> b : backwardList) {
                    int forward = l.get(1);
                    int backward = b.get(1);
                    int tot = (forward + backward);
                    if (tot > maxDist) {
                        break;
                    }
                    if (tot == maxDist) {
                        // print the pair of Id and optimum distance
                        result.add(Arrays.asList(l.get(0), b.get(0), maxDist));
                        break;
                    }

                }
            }
            if (result.size() > 0) {
                break;
            }
            maxDist--;
        }
        return result;
    }

}