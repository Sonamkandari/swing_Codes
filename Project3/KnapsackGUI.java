import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class KnapsackGUI extends JFrame {
    private JTextArea outputArea;
    private final int[] profits = {2, 3, 4, 1};
    private final int[] weights = {3, 4, 5, 6};
    private final int CAPACITY = 8;

    public KnapsackGUI() {
        setTitle("0/1 Knapsack Problem Solver");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnNames = {"Item", "1", "2", "3", "4"};
        Object[][] data = {
                {"Profit", "2", "3", "4", "1"},
                {"Weight", "3", "4", "5", "6"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setEnabled(false);
        table.setRowHeight(30);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(102, 204, 0));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(new Color(204, 255, 204));
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        JScrollPane tableScrollPane = new JScrollPane(table);
        add(tableScrollPane, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new FlowLayout());
        JButton solveGreedyButton = new JButton("Solve with Greedy Approach");
        JButton solveDPButton = new JButton("Solve with Dynamic Programming");
        inputPanel.add(solveGreedyButton);
        inputPanel.add(solveDPButton);

        add(inputPanel, BorderLayout.CENTER);
        outputArea = new JTextArea(10, 50);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);  
        outputArea.setWrapStyleWord(true);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);
        outputScrollPane.setPreferredSize(new Dimension(600, 200)); 
        add(outputScrollPane, BorderLayout.SOUTH);

        solveGreedyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveUsingGreedy();
            }
        });

        solveDPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveUsingDynamicProgramming();
            }
        });
    }

    private void solveUsingGreedy() {
        outputArea.setText("");
        ArrayList<Item> items = getItems();

        Collections.sort(items, (a, b) -> Double.compare(b.profitPerWeight(), a.profitPerWeight()));

        int currentWeight = 0;
        int currentProfit = 0;
        StringBuilder result = new StringBuilder("Selected items using Greedy Approach:\n");

        for (Item item : items) {
            if (currentWeight + item.weight <= CAPACITY) {
                currentWeight += item.weight;
                currentProfit += item.profit;
                result.append("Item with Profit = ").append(item.profit)
                      .append(" and Weight = ").append(item.weight).append("\n");
            }
        }

        result.append("Total Weight: ").append(currentWeight).append("\n");
        result.append("Total Profit: ").append(currentProfit).append("\n");
        result.append("Note: Greedy approach may not give the optimal solution for 0/1 Knapsack.");

        outputArea.setText(result.toString());
    }

    private void solveUsingDynamicProgramming() {
        outputArea.setText("");
        ArrayList<Item> items = getItems();
        int n = items.size();
        int[][] dp = new int[n + 1][CAPACITY + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= CAPACITY; w++) {
                if (items.get(i - 1).weight <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - items.get(i - 1).weight] + items.get(i - 1).profit);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

  
        outputArea.append("DP Table:\n");
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= CAPACITY; w++) {
                outputArea.append(dp[i][w] + "\t");
            }
            outputArea.append("\n");
        }

        int maxProfit = dp[n][CAPACITY];
        int remainingCapacity = CAPACITY;
        ArrayList<Item> selectedItems = new ArrayList<>();

        for (int i = n; i > 0 && maxProfit > 0; i--) {
            if (maxProfit != dp[i - 1][remainingCapacity]) {
                selectedItems.add(items.get(i - 1));
                maxProfit -= items.get(i - 1).profit;
                remainingCapacity -= items.get(i - 1).weight;
            }
        }

       
        outputArea.append("\nSelected items for optimal solution:\n");
        for (Item item : selectedItems) {
            outputArea.append("Item with Profit = " + item.profit + ", Weight = " + item.weight + "\n");
        }
        outputArea.append("Maximum Profit: " + dp[n][CAPACITY]);
    }

    private ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) {
            items.add(new Item(profits[i], weights[i]));
        }
        return items;
    }

    static class Item {
        int profit;
        int weight;

        public Item(int profit, int weight) {
            this.profit = profit;
            this.weight = weight;
        }

        public double profitPerWeight() {
            return (double) profit / weight;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KnapsackGUI gui = new KnapsackGUI();
            gui.setVisible(true);
        });
    }
}
