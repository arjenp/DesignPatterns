package com.arjen;


import com.arjen.adapterPattern.AdapterPatternDemo;
import com.arjen.factoryPattern.FactoryPatternDemo;
import com.arjen.factoryPattern.decoratorPattern.DecoratorPatternDemo;
import com.arjen.factoryPattern.iteratorPattern.IteratorPatternDemo;
import com.arjen.factoryPattern.visitorPattern.VisitorPatternDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by arjen on 27-6-2016.
 */
public class PatternChooser {
    private JButton factoryPatternDemoButton;
    private JButton adapterPatternDemoButton;
    private JButton decoratorPatternDemoButton;
    private JButton iteratorPatternDemoButton;
    private JButton visitorPatternDemoButton;
    private JPanel patternView;


    public PatternChooser(){

        factoryPatternDemoButton.addActionListener(new PatternBtnClicked("factory"));
        adapterPatternDemoButton.addActionListener(new PatternBtnClicked("adapter"));
        decoratorPatternDemoButton.addActionListener(new PatternBtnClicked("decorator"));
        iteratorPatternDemoButton.addActionListener(new PatternBtnClicked("iterator"));
        visitorPatternDemoButton.addActionListener(new PatternBtnClicked("visitor"));
    }


    private class PatternBtnClicked implements ActionListener{

        private String pattern;

        public PatternBtnClicked(String pattern){
            this.pattern = pattern;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (pattern){
                case "factory":
                    FactoryPatternDemo factoryPatternDemo = new FactoryPatternDemo();

                    factoryPatternDemo.testFactoryPattern();
                    break;
                case "adapter":
                    AdapterPatternDemo adapterPatternDemo = new AdapterPatternDemo();

                    adapterPatternDemo.testAdapterPattern();
                    break;
                case "decorator":
                    DecoratorPatternDemo decoratorPatternDemo = new DecoratorPatternDemo();

                    decoratorPatternDemo.testDecoratorPattern();
                    break;
                case "iterator":
                    IteratorPatternDemo iteratorPatternDemo = new IteratorPatternDemo();

                    iteratorPatternDemo.testIteratorPattern();
                    break;
                case "visitor":
                    VisitorPatternDemo visitorPatternDemo = new VisitorPatternDemo();

                    visitorPatternDemo.testVisitorPattern();
                    break;
            }


        }
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("PatternChooser");
        frame.setContentPane(new PatternChooser().patternView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
