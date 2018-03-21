package com.example.android.vits_block;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity_c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment_c(View view) {
        quantity_c++;
        display_c(quantity_c);
        //displayPrice(quantity * 10);
    }
    public void decrement_c(View view) {
        quantity_c--;
        display_c(quantity_c);
            //displayPrice(quantity * 10);
    }

    public void calculate_c(View view){
        if(quantity_c<0)
            quantity_c=0;
        if(quantity_c>8)
            quantity_c=8;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_c(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_c);
        quantityTextView.setText("" + number);
    }

    int quantity_tt=0;
    public void increment_tt(View view) {
        quantity_tt++;
        display_tt(quantity_c);
        //displayPrice(quantity * 10);
    }
    public void decrement_tt(View view) {
        quantity_tt--;
        display_tt(quantity_c);
        //displayPrice(quantity * 10);
    }

    public void calculate_tt(View view){
        if(quantity_tt<0)
            quantity_tt=0;
        if(quantity_tt>3)
            quantity_tt=3;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_tt(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_tt);
        quantityTextView.setText("" + number);
    }

    int quantity_k=0;
    public void increment_k(View view) {
        quantity_k++;
        display_k(quantity_k);
        //displayPrice(quantity * 10);
    }
    public void decrement_k(View view) {
        quantity_k--;
        display_k(quantity_k);
        //displayPrice(quantity * 10);
    }

    public void calculate_k(View view){
        if(quantity_k<0)
            quantity_k=0;
        if(quantity_k>1)
            quantity_k=1;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_k(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_k);
        quantityTextView.setText("" + number);
    }

    int quantity_ps=0;
    public void increment_ps(View view) {
        quantity_ps++;
        display_ps(quantity_ps);
        //displayPrice(quantity * 10);
    }
    public void decrement_ps(View view) {
        quantity_ps--;
        display_ps(quantity_ps);
        //displayPrice(quantity * 10);
    }

    public void calculate_ps(View view){
        if(quantity_ps<0)
            quantity_ps=0;
        if(quantity_ps>3)
            quantity_ps=3;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_ps(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_ps);
        quantityTextView.setText("" + number);
    }

    int quantity_f=0;
    public void increment_f(View view) {
        quantity_f++;
        display_f(quantity_f);
        //displayPrice(quantity * 10);
    }
    public void decrement_f(View view) {
        quantity_f--;
        display_f(quantity_f);
        //displayPrice(quantity * 10);
    }

    public void calculate_f(View view){
        if(quantity_f<0)
            quantity_f=0;
        if(quantity_f>1)
            quantity_f=1;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_f(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_f);
        quantityTextView.setText("" + number);
    }

    int quantity_p=0;
    public void increment_p(View view) {
        quantity_p++;
        display_p(quantity_p);
        //displayPrice(quantity * 10);
    }
    public void decrement_p(View view) {
        quantity_p--;
        display_p(quantity_p);
        //displayPrice(quantity * 10);
    }

    public void calculate_p(View view){
        if(quantity_p<0)
            quantity_p=0;
        if(quantity_p>2)
            quantity_p=2;
    }
    private void display_p(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_p);
        quantityTextView.setText("" + number);
    }

    int quantity_ch=0;
    public void increment_ch(View view) {
        quantity_ch++;
        display_ch(quantity_ch);
        //displayPrice(quantity * 10);
    }
    public void decrement_ch(View view) {
        quantity_ch--;
        display_ch(quantity_ch);
        //displayPrice(quantity * 10);
    }

    public void calculate_ch(View view){
        if(quantity_ch<0)
            quantity_ch=0;
        if(quantity_ch>2)
            quantity_ch=2;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display_ch(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_ch);
        quantityTextView.setText("" + number);
    }


}
