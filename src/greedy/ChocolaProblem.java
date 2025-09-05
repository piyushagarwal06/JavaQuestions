package greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;

        // Cost of vertical cuts (there are m-1 vertical cuts)
        Integer costVer[] = {2, 1, 3, 1, 4}; // 5 elements for 6 columns

        // Cost of horizontal cuts (there are n-1 horizontal cuts)
        Integer costHor[] = {4, 1, 2}; // 3 elements for 4 rows

        // Sort both cost arrays in descending order
        // This ensures we pick the most expensive cuts first — Greedy strategy
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // Initialize pointers for costVer (v) and costHor (h)
        int h = 0, v = 0;

        // Track number of current horizontal and vertical pieces
        // Initially, one piece horizontally and vertically (the whole chocolate)
        int hp = 1, vp = 1;

        int cost = 0; // Total minimum cost

        // Process both arrays until one of them is fully traversed
        while (h < costHor.length && v < costVer.length) {
            // If next horizontal cut is more costly or equal
            if (costVer[v] <= costHor[h]) {
                // Make horizontal cut: cost = cost * number of vertical pieces
                cost += (costHor[h] * vp);
                hp++; // Increase horizontal piece count
                h++;  // Move to next horizontal cut
            } else {
                // Make vertical cut: cost = cost * number of horizontal pieces
                cost += (costVer[v] * hp);
                vp++; // Increase vertical piece count
                v++;  // Move to next vertical cut
            }
        }

        // Process remaining horizontal cuts (if any)
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        // Process remaining vertical cuts (if any)
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        // Output the final minimum cost
        System.out.print("Minimum cost of cutting the chocolate = " + cost);
    }
}

