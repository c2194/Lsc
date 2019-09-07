package com.c2194.Lsc;


public class LLcou {
    public int cou; // 帧计数器
    public char Width; //宽度
    // 当前位置 也就是帧 计数器

    // 色彩二维数组
    // 记录若干组线的每个点的亮度色彩 预留了 阿尔法值单元 但是未启用
    // 【R】【G】【B】【A】
    //  第一行记录线长度
    int[][] lightline = new int[1024][4];


    // 长度 - 位置   可变的长度
    // 第一行 数据总长
    int[][] lengthFrame = new int[1024][2];



    // 速度 - 位置  从上一位置到这一位置需要的 帧 或者 时间
    int[][] speedFrame = new int[1024][2];


    // 亮度 - 位置  是一个 阿尔法通道的值
    int[][]  alphaFrame = new int[1024][2];



    // 每帧计算出 上述值得变化

    // 环数据 ，记录一圈点 的坐标，主要记录圆弧，通过算法 计算出角和园


    public float[][]fPath = new float[][]{


            // x y c长度 方向

            {417,4,10,8},


            {427,5,10,8},


            {437,8,10,8},


            {445,12,10,8},


            {453,19,10,8},


            {460,28,10,8},


            {465,39,10,8},





            {470,51,10,8},


            {474,60,10,8},



            {480,69,10,8},




            {487,78,10,8},



            {495,85,10,8},



            {504,91,10,8},





            {514,96,10,8},


            {526,98,10,8},




            {540,100,10,8},



            {554,98,10,8},



            {566,96,10,8},



            {576,91,10,8},



            {585,85,10,8},



            {593,78,10,8},



            {600,69,10,8},




            {606,60,10,8},



            {610,51,10,8},




            {615,39,10,8},



            {620,28,10,8},


            {627,19,10,8},



            {635,12,10,8},


            {643,8,10,8},


            {653,5,10,8},



            {663,4,10,8}




    };





    int[] face_pit  = new int[]{417,4,
            417,5,

            427,5,
            427,6,

            437,8,
            437,9,

            445,12,
            445,13,

            453,19,
            453,20,


            460,28,
            460,29,

            465,39,
            465,40,




            470,51,
            470,52,

            474,60,
            474,61,


            480,69,
            480,70,



            487,78,
            487,79,


            495,85,
            495,86,


            504,91,
            504,92,




            514,96,
            514,97,

            526,98,
            526,99,



            540,100,
            540,101,


            554,98,
            554,99,


            566,96,
            566,97,


            576,91,
            576,92,


            585,85,
            585,86,


            593,78,
            593,79,


            600,69,
            600,70,



            606,60,
            606,61,


            610,51,
            610,52,



            615,39,
            615,40,


            620,28,
            620,29,

            627,19,
            627,20,


            635,12,
            635,13,

            643,8,
            643,9,

            653,5,
            653,6,


            663,4,
            553,5




    };

    public  int[][] ringPath = new int[][]{

            {7,5,5,180,180,180,90,90},
            {8,93,5,412,5,0,0,319},
            {9,360,5,462,60,-90,85,85},  // 494
            {1,461,-70,619,100,170,-160,155}, // 656
            {7,618,5,720,60,-90,-85,90}, // 741
            {8,668,5,985,5,0,0,317},  //1058
            {9,895,5,1075,180,0,-90,90}, //1148
            {6,1074,93,1074,2145,0,0,2052}, //3200
            {3,895,2055,1075,2235,90,-90,90}, //3290
            {2,93,2235,986,2235,0,0,893}, // 4187
            {1,5,2055,180,2235,180,-90,90}, // 4278
            {4,5,93,5,2145,0,0,2052}  //6330
    };












}

