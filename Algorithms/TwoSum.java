package com.zjj.hello;
/**
 * @author JJDJJ
 * @create 2017-10-18 14:31
 **/

import java.util.HashMap;

/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:...
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] reqInt = new int[4];
        reqInt[0] = -6;
        reqInt[1] = 8;
        reqInt[2] = 15;
        reqInt[3] = 22;
        int target = 2;
        int[] result = new int[2];
        TwoSum twoSum = new TwoSum();
        result= twoSum.getTwoSumIndex(reqInt,target);
        System.out.printf("这两个数的索引是" + result[0] + "," + result[1]);
    }

    public int[] getTwoSumIndex(int[] nums,int target){
        int[] respInt = new int[2];
        if(null == nums || nums.length < 2 ){
            return respInt;
        }else{
            HashMap<Integer,Integer> arrayMap = new HashMap<Integer, Integer>();
            for(int i = 0;i < nums.length;i++){
                if(!arrayMap.containsKey(target - nums[i])){
                    arrayMap.put(nums[i],i);
                }else{
                    respInt[0] = arrayMap.get(target - nums[i]);
                    respInt[1] = i;
                    break;
                }
            }
        }

        return respInt;
    }
}
