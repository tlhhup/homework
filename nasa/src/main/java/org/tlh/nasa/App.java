package org.tlh.nasa;

import org.apache.commons.lang3.StringUtils;
import org.tlh.nasa.entity.Map;
import org.tlh.nasa.entity.Train;
import org.tlh.nasa.enums.DirectionEnum;

import java.util.List;
import java.util.Scanner;

public class App {

    private static final String SPE=" ";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入地图右上角位置：");
        String input = scanner.nextLine();
        if(!StringUtils.isEmpty(input)) {
            String[] location = input.split(SPE);
            //int map
            Map map=new Map();
            map.setX(Integer.parseInt(location[0]));
            map.setY(Integer.parseInt(location[1]));
            Train train=null;

            do {
                // add train
                System.out.print("请输入火星车的位置和朝向(N、E、S、W):");
                input=scanner.nextLine();
                if(StringUtils.isEmpty(input)){
                    System.out.println("数据输入错误，请重新输入！");
                    continue;
                }
                location=input.split(SPE);
                // init train
                train=new Train(Integer.parseInt(location[0]),Integer.parseInt(location[1]));
                train.setDirection(DirectionEnum.valueOf(location[2]));

                // set commands
                System.out.print("请输入火星车移动的指令L(左转) R(右转) M(移动):");
                input=scanner.nextLine();
                if(StringUtils.isEmpty(input)){
                    System.out.println("数据输入错误，请重新输入！");
                    continue;
                }
                train.setCommands(input);

                map.addTrain(train);
                train=null;

                System.out.print("是否继续添加火星车?(y n):");
                input=scanner.nextLine();
            }while("y".equalsIgnoreCase(input));

            //start
            map.start();

            //outPut
            List<Train> trains = map.getTrains();
            trains.forEach(t-> System.out.println(t));
        }
    }

}
