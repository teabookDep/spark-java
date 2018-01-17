package com.smang.spark.java8.basic.actions;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates Take example
 *
 * Returns a list of n elements of the RDD, where n is the parameter passed to the take action
 */
public class TakeExample {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("Take Example").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<Integer> inputRDD = sc.parallelize(Arrays.asList(1, 2, 3, 4, 5, 2, 6, 5, 1, 2, 1, 1, 90, 100));
        List<Integer> takeValues=inputRDD.take(5);
        System.out.println(String.format("takeValues: %s",takeValues));
    }
}