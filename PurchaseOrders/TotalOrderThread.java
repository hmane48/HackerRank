package PurchaseOrders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TotalOrderThread implements Runnable {

    private List<String> input;
    private Map<Integer, Integer> ordermap;

    public TotalOrderThread(List<String> input, Map<Integer, Integer> ordermap) {
        this.input = input;
        this.ordermap = ordermap;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public void setOrdermap(Map<Integer, Integer> ordermap) {
        this.ordermap = ordermap;
    }

    public List<String> getInput() {
        return input;
    }

    public Map<Integer, Integer> getOrdermap() {
        return ordermap;
    }

    @Override
    public void run() {

        String[] sArray = new String[2];
        Date date = null;

        for (String s : input) {
            sArray = s.split(",");
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(sArray[0]);
                ordermap.put(date.getMonth(), ordermap.get(date.getMonth()) + 1);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }
}
