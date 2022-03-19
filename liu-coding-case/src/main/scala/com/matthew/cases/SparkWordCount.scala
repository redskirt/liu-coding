package com.matthew.cases

import org.apache.spark.{SparkConf, SparkContext}

object SparkWordCount {

  def main(args: Array[String]): Unit = {
    /**
     * Scala 2.13
     * https://scala-lang.org/download/scala2.html
     *
     * Spark spark-3.2.1-bin-hadoop3.2-scala2.13
     * https://spark.apache.org/downloads.html
     */

    /*
     * 案例实践分析
     * 统计英语文本（以" "为分隔符）的单词词频出现数
     * 用现实的思维分析Wordcount案例问题应该怎么办？
     *
     * I do love you and you love me too.
     */

    // 创建 sc 对象
    val sc = new SparkContext(new SparkConf())

    /*
     * - Scala 的链式写法
     * - 注意每一次使用
     * - 在面向数据编程时，注重表达数据处理每一个环节，通常在每一个"链环"的尾端注释步骤
     * - 减少代码量有什么优缺点？尾端注释有什么优点？
     * - 生产环境中，所有的 Spark 代码将在集群中运行
     */
    sc.textFile("/Users/sasaki/Downloads/sample.rtfd") //
      .flatMap(_.split(" "))                          //
      .map((_, 1))                                           //
      .reduceByKey(_ + _)                                    //
      .map(o => (o._2, o._1))                                //
      .collect                                               //
      .foreach(println)                                      //
    sc.stop
  }
}


