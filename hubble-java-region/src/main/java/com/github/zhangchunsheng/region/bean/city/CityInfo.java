package com.github.zhangchunsheng.region.bean.city;

import java.util.HashMap;
import java.util.Map;

public class CityInfo {
    public final static String SHORT_BJ = "bj"; // 北京
    public final static String SHORT_TJ = "tj"; // 天津
    public final static String SHORT_SJZ = "sjz"; // 石家庄
    public final static String SHORT_TS = "ts"; // 唐山
    public final static String SHORT_QHD = "qhd"; // 秦皇岛
    public final static String SHORT_HD = "hd"; // 邯郸
    public final static String SHORT_XT = "xt"; // 邢台
    public final static String SHORT_BAOD = "baod"; // 保定
    public final static String SHORT_ZJK = "zjk"; // 张家口
    public final static String SHORT_CHENGDE = "chengde"; // 承德
    public final static String SHORT_CANGZHOU = "cangzhou"; // 沧州
    public final static String SHORT_LF = "lf"; // 廊坊
    public final static String SHORT_HS = "hs"; // 衡水
    public final static String SHORT_TY = "ty"; // 太原
    public final static String SHORT_DT = "dt"; // 大同
    public final static String SHORT_YQ = "yq"; // 阳泉
    public final static String SHORT_CHANGZHI = "changzhi"; // 长治
    public final static String SHORT_JINCHENG = "jincheng"; // 晋城
    public final static String SHORT_SHUOZHOU = "shuozhou"; // 朔州
    public final static String SHORT_JZ = "jz"; // 晋中
    public final static String SHORT_PY = "py"; // 平遥
    public final static String SHORT_YUNCHENG = "yuncheng"; // 运城
    public final static String SHORT_XINZHOU = "xinzhou"; // 忻州
    public final static String SHORT_LINFEN = "linfen"; // 临汾
    public final static String SHORT_LVLIANG = "lvliang"; // 吕梁
    public final static String SHORT_HU = "hu"; // 呼和浩特
    public final static String SHORT_BT = "bt"; // 包头
    public final static String SHORT_WUHAI = "wuhai"; // 乌海
    public final static String SHORT_CHIFENG = "chifeng"; // 赤峰
    public final static String SHORT_TONGLIAO = "tongliao"; // 通辽
    public final static String SHORT_ERDS = "erds"; // 鄂尔多斯
    public final static String SHORT_HLBE = "hlbe"; // 呼伦贝尔
    public final static String SHORT_MANZL = "manzl"; // 满洲里
    public final static String SHORT_BYNE = "byne"; // 巴彦淖尔
    public final static String SHORT_WLCB = "wlcb"; // 乌兰察布
    public final static String SHORT_XAN = "xan"; // 兴安盟
    public final static String SHORT_XLGL = "xlgl"; // 锡林郭勒
    public final static String SHORT_ALS = "als"; // 阿拉善盟
    public final static String SHORT_SY = "sy"; // 沈阳
    public final static String SHORT_DL = "dl"; // 大连
    public final static String SHORT_AS = "as"; // 鞍山
    public final static String SHORT_FUSHUN = "fushun"; // 抚顺
    public final static String SHORT_BENXI = "benxi"; // 本溪
    public final static String SHORT_DANDONG = "dandong"; // 丹东
    public final static String SHORT_JINZHOU = "jinzhou"; // 锦州
    public final static String SHORT_YK = "yk"; // 营口
    public final static String SHORT_FX = "fx"; // 阜新
    public final static String SHORT_LIAOYANG = "liaoyang"; // 辽阳
    public final static String SHORT_PJ = "pj"; // 盘锦
    public final static String SHORT_TL = "tl"; // 铁岭
    public final static String SHORT_CY = "cy"; // 朝阳
    public final static String SHORT_HLD = "hld"; // 葫芦岛
    public final static String SHORT_CC = "cc"; // 长春
    public final static String SHORT_JL = "jl"; // 吉林
    public final static String SHORT_SP = "sp"; // 四平
    public final static String SHORT_LIAOYUAN = "liaoyuan"; // 辽源
    public final static String SHORT_TH = "th"; // 通化
    public final static String SHORT_BAISHAN = "baishan"; // 白山
    public final static String SHORT_SONGYUAN = "songyuan"; // 松原
    public final static String SHORT_BC = "bc"; // 白城
    public final static String SHORT_YANBIAN = "yanbian"; // 延边
    public final static String SHORT_HRB = "hrb"; // 哈尔滨
    public final static String SHORT_QQHR = "qqhr"; // 齐齐哈尔
    public final static String SHORT_JIXI = "jixi"; // 鸡西
    public final static String SHORT_HEGANG = "hegang"; // 鹤岗
    public final static String SHORT_SYS = "sys"; // 双鸭山
    public final static String SHORT_DQ = "dq"; // 大庆
    public final static String SHORT_YICH = "yich"; // 伊春
    public final static String SHORT_JMS = "jms"; // 佳木斯
    public final static String SHORT_QTH = "qth"; // 七台河
    public final static String SHORT_MDJ = "mdj"; // 牡丹江
    public final static String SHORT_HEIHE = "heihe"; // 黑河
    public final static String SHORT_SUIHUA = "suihua"; // 绥化
    public final static String SHORT_DXAL = "dxal"; // 大兴安岭
    public final static String SHORT_SH = "sh"; // 上海
    public final static String SHORT_NJ = "nj"; // 南京
    public final static String SHORT_WX = "wx"; // 无锡
    public final static String SHORT_JIANGYIN = "jiangyin"; // 江阴
    public final static String SHORT_XZ = "xz"; // 徐州
    public final static String SHORT_CZ = "cz"; // 常州
    public final static String SHORT_LIYANG = "liyang"; // 溧阳
    public final static String SHORT_SU = "su"; // 苏州
    public final static String SHORT_KUNSHAN = "kunshan"; // 昆山
    public final static String SHORT_NT = "nt"; // 南通
    public final static String SHORT_LYG = "lyg"; // 连云港
    public final static String SHORT_HA = "ha"; // 淮安
    public final static String SHORT_YANCHENG = "yancheng"; // 盐城
    public final static String SHORT_YZ = "yz"; // 扬州
    public final static String SHORT_ZJ = "zj"; // 镇江
    public final static String SHORT_TAIZHOU = "taizhou"; // 泰州
    public final static String SHORT_SUQIAN = "suqian"; // 宿迁
    public final static String SHORT_HZ = "hz"; // 杭州
    public final static String SHORT_NB = "nb"; // 宁波
    public final static String SHORT_WZ = "wz"; // 温州
    public final static String SHORT_JX = "jx"; // 嘉兴
    public final static String SHORT_HUZHOU = "huzhou"; // 湖州
    public final static String SHORT_SX = "sx"; // 绍兴
    public final static String SHORT_JH = "jh"; // 金华
    public final static String SHORT_YIWU = "yiwu"; // 义乌
    public final static String SHORT_QUZHOU = "quzhou"; // 衢州
    public final static String SHORT_ZHOUSHAN = "zhoushan"; // 舟山
    public final static String SHORT_TZ = "tz"; // 台州
    public final static String SHORT_LISHUI = "lishui"; // 丽水
    public final static String SHORT_HF = "hf"; // 合肥
    public final static String SHORT_WUHU = "wuhu"; // 芜湖
    public final static String SHORT_BENGBU = "bengbu"; // 蚌埠
    public final static String SHORT_HN = "hn"; // 淮南
    public final static String SHORT_MAS = "mas"; // 马鞍山
    public final static String SHORT_HUAIBEI = "huaibei"; // 淮北
    public final static String SHORT_TONGLING = "tongling"; // 铜陵
    public final static String SHORT_ANQING = "anqing"; // 安庆
    public final static String SHORT_HUANGSHAN = "huangshan"; // 黄山
    public final static String SHORT_CHUZHOU = "chuzhou"; // 滁州
    public final static String SHORT_FY = "fy"; // 阜阳
    public final static String SHORT_SUZHOUSZ = "suzhousz"; // 宿州
    public final static String SHORT_CH = "ch"; // 巢湖
    public final static String SHORT_LA = "la"; // 六安
    public final static String SHORT_BOZHOU = "bozhou"; // 亳州
    public final static String SHORT_CHIZHOU = "chizhou"; // 池州
    public final static String SHORT_XUANCHENG = "xuancheng"; // 宣城
    public final static String SHORT_FZ = "fz"; // 福州
    public final static String SHORT_XM = "xm"; // 厦门
    public final static String SHORT_PT = "pt"; // 莆田
    public final static String SHORT_SM = "sm"; // 三明
    public final static String SHORT_QZ = "qz"; // 泉州
    public final static String SHORT_ZHANGZHOU = "zhangzhou"; // 漳州
    public final static String SHORT_NP = "np"; // 南平
    public final static String SHORT_WYS = "wys"; // 武夷山
    public final static String SHORT_LY = "ly"; // 龙岩
    public final static String SHORT_ND = "nd"; // 宁德
    public final static String SHORT_NC = "nc"; // 南昌
    public final static String SHORT_JDZ = "jdz"; // 景德镇
    public final static String SHORT_PX = "px"; // 萍乡
    public final static String SHORT_JJ = "jj"; // 九江
    public final static String SHORT_XINYU = "xinyu"; // 新余
    public final static String SHORT_YINGTAN = "yingtan"; // 鹰潭
    public final static String SHORT_GANZHOU = "ganzhou"; // 赣州
    public final static String SHORT_JA = "ja"; // 吉安
    public final static String SHORT_YICHUN = "yichun"; // 宜春
    public final static String SHORT_FUZ = "fuz"; // 抚州
    public final static String SHORT_SR = "sr"; // 上饶
    public final static String SHORT_JN = "jn"; // 济南
    public final static String SHORT_QD = "qd"; // 青岛
    public final static String SHORT_ZB = "zb"; // 淄博
    public final static String SHORT_ZAOZHUANG = "zaozhuang"; // 枣庄
    public final static String SHORT_DY = "dy"; // 东营
    public final static String SHORT_YT = "yt"; // 烟台
    public final static String SHORT_WF = "wf"; // 潍坊
    public final static String SHORT_JINING = "jining"; // 济宁
    public final static String SHORT_QF = "qf"; // 曲阜
    public final static String SHORT_TA = "ta"; // 泰安
    public final static String SHORT_WEIHAI = "weihai"; // 威海
    public final static String SHORT_RIZHAO = "rizhao"; // 日照
    public final static String SHORT_LW = "lw"; // 莱芜
    public final static String SHORT_LINYI = "linyi"; // 临沂
    public final static String SHORT_DZ = "dz"; // 德州
    public final static String SHORT_LC = "lc"; // 聊城
    public final static String SHORT_BZ = "bz"; // 滨州
    public final static String SHORT_HEZE = "heze"; // 菏泽
    public final static String SHORT_ZZ = "zz"; // 郑州
    public final static String SHORT_DF = "df"; // 登封
    public final static String SHORT_KAIFENG = "kaifeng"; // 开封
    public final static String SHORT_LUOYANG = "luoyang"; // 洛阳
    public final static String SHORT_PDS = "pds"; // 平顶山
    public final static String SHORT_AY = "ay"; // 安阳
    public final static String SHORT_HB = "hb"; // 鹤壁
    public final static String SHORT_XX = "xx"; // 新乡
    public final static String SHORT_JIAOZUO = "jiaozuo"; // 焦作
    public final static String SHORT_PUYANG = "puyang"; // 濮阳
    public final static String SHORT_XC = "xc"; // 许昌
    public final static String SHORT_LUOHE = "luohe"; // 漯河
    public final static String SHORT_SMX = "smx"; // 三门峡
    public final static String SHORT_NY = "ny"; // 南阳
    public final static String SHORT_SQ = "sq"; // 商丘
    public final static String SHORT_XY = "xy"; // 信阳
    public final static String SHORT_ZK = "zk"; // 周口
    public final static String SHORT_ZMD = "zmd"; // 驻马店
    public final static String SHORT_JIYUAN = "jiyuan"; // 济源
    public final static String SHORT_WH = "wh"; // 武汉
    public final static String SHORT_HSHI = "hshi"; // 黄石
    public final static String SHORT_SHIYAN = "shiyan"; // 十堰
    public final static String SHORT_YC = "yc"; // 宜昌
    public final static String SHORT_XF = "xf"; // 襄阳
    public final static String SHORT_EZ = "ez"; // 鄂州
    public final static String SHORT_JINGMEN = "jingmen"; // 荆门
    public final static String SHORT_XIAOGAN = "xiaogan"; // 孝感
    public final static String SHORT_JINGZHOU = "jingzhou"; // 荆州
    public final static String SHORT_HG = "hg"; // 黄冈
    public final static String SHORT_XIANNING = "xianning"; // 咸宁
    public final static String SHORT_SUIZHOU = "suizhou"; // 随州
    public final static String SHORT_ES = "es"; // 恩施
    public final static String SHORT_XIANTAO = "xiantao"; // 仙桃
    public final static String SHORT_QIANJIANG = "qianjiang"; // 潜江
    public final static String SHORT_TIANMEN = "tianmen"; // 天门
    public final static String SHORT_SHENNONGJIA = "shennongjia"; // 神农架
    public final static String SHORT_CHS = "chs"; // 长沙
    public final static String SHORT_ZHUZHOU = "zhuzhou"; // 株洲
    public final static String SHORT_XIANGTAN = "xiangtan"; // 湘潭
    public final static String SHORT_HY = "hy"; // 衡阳
    public final static String SHORT_SHAOYANG = "shaoyang"; // 邵阳
    public final static String SHORT_YY = "yy"; // 岳阳
    public final static String SHORT_CHANGDE = "changde"; // 常德
    public final static String SHORT_ZJJ = "zjj"; // 张家界
    public final static String SHORT_YIYANG = "yiyang"; // 益阳
    public final static String SHORT_CHENZHOU = "chenzhou"; // 郴州
    public final static String SHORT_YONGZHOU = "yongzhou"; // 永州
    public final static String SHORT_HH = "hh"; // 怀化
    public final static String SHORT_LD = "ld"; // 娄底
    public final static String SHORT_XIANGXI = "xiangxi"; // 湘西
    public final static String SHORT_GZ = "gz"; // 广州
    public final static String SHORT_SG = "sg"; // 韶关
    public final static String SHORT_SZ = "sz"; // 深圳
    public final static String SHORT_ZH = "zh"; // 珠海
    public final static String SHORT_ST = "st"; // 汕头
    public final static String SHORT_FS = "fs"; // 佛山
    public final static String SHORT_SD = "sd"; // 顺德
    public final static String SHORT_JM = "jm"; // 江门
    public final static String SHORT_ZHANJIANG = "zhanjiang"; // 湛江
    public final static String SHORT_MM = "mm"; // 茂名
    public final static String SHORT_ZQ = "zq"; // 肇庆
    public final static String SHORT_HUIZHOU = "huizhou"; // 惠州
    public final static String SHORT_MZ = "mz"; // 梅州
    public final static String SHORT_SW = "sw"; // 汕尾
    public final static String SHORT_HEYUAN = "heyuan"; // 河源
    public final static String SHORT_YJ = "yj"; // 阳江
    public final static String SHORT_QINGYUAN = "qingyuan"; // 清远
    public final static String SHORT_DG = "dg"; // 东莞
    public final static String SHORT_ZS = "zs"; // 中山
    public final static String SHORT_CHAOZHOU = "chaozhou"; // 潮州
    public final static String SHORT_JY = "jy"; // 揭阳
    public final static String SHORT_YF = "yf"; // 云浮
    public final static String SHORT_NN = "nn"; // 南宁
    public final static String SHORT_LIUZHOU = "liuzhou"; // 柳州
    public final static String SHORT_GL = "gl"; // 桂林
    public final static String SHORT_YANGSHUO = "yangshuo"; // 阳朔
    public final static String SHORT_WUZHOU = "wuzhou"; // 梧州
    public final static String SHORT_BH = "bh"; // 北海
    public final static String SHORT_FCG = "fcg"; // 防城港
    public final static String SHORT_QINZHOU = "qinzhou"; // 钦州
    public final static String SHORT_GG = "gg"; // 贵港
    public final static String SHORT_YULIN = "yulin"; // 玉林
    public final static String SHORT_BAISE = "baise"; // 百色
    public final static String SHORT_HEZHOU = "hezhou"; // 贺州
    public final static String SHORT_HC = "hc"; // 河池
    public final static String SHORT_LB = "lb"; // 来宾
    public final static String SHORT_CHONGZUO = "chongzuo"; // 崇左
    public final static String SHORT_HAIKOU = "haikou"; // 海口
    public final static String SHORT_SANYA = "sanya"; // 三亚
    public final static String SHORT_SANSHA = "sansha"; // 三沙
    public final static String SHORT_WZS = "wzs"; // 五指山
    public final static String SHORT_QIONGHAI = "qionghai"; // 琼海
    public final static String SHORT_DANZHOU = "danzhou"; // 儋州
    public final static String SHORT_WENCHANG = "wenchang"; // 文昌
    public final static String SHORT_WANNING = "wanning"; // 万宁
    public final static String SHORT_DONGFANG = "dongfang"; // 东方
    public final static String SHORT_DINGAN = "dingan"; // 定安
    public final static String SHORT_TUNCHANG = "tunchang"; // 屯昌
    public final static String SHORT_CHENGMAI = "chengmai"; // 澄迈
    public final static String SHORT_LINGAO = "lingao"; // 临高
    public final static String SHORT_BAISHA = "baisha"; // 白沙
    public final static String SHORT_LEDONG = "ledong"; // 乐东
    public final static String SHORT_LINGSHUI = "lingshui"; // 陵水
    public final static String SHORT_BAOTING = "baoting"; // 保亭
    public final static String SHORT_QIONGZHONG = "qiongzhong"; // 琼中
    public final static String SHORT_CQ = "cq"; // 重庆
    public final static String SHORT_CD = "cd"; // 成都
    public final static String SHORT_DJY = "djy"; // 都江堰
    public final static String SHORT_ZG = "zg"; // 自贡
    public final static String SHORT_PANZHIHUA = "panzhihua"; // 攀枝花
    public final static String SHORT_LUZHOU = "luzhou"; // 泸州
    public final static String SHORT_DEYANG = "deyang"; // 德阳
    public final static String SHORT_GH = "gh"; // 广汉
    public final static String SHORT_MIANYANG = "mianyang"; // 绵阳
    public final static String SHORT_GUANGYUAN = "guangyuan"; // 广元
    public final static String SHORT_SUINING = "suining"; // 遂宁
    public final static String SHORT_SCNJ = "scnj"; // 内江
    public final static String SHORT_LS = "ls"; // 乐山
    public final static String SHORT_EMS = "ems"; // 峨眉山
    public final static String SHORT_NANCHONG = "nanchong"; // 南充
    public final static String SHORT_MS = "ms"; // 眉山
    public final static String SHORT_YB = "yb"; // 宜宾
    public final static String SHORT_GA = "ga"; // 广安
    public final static String SHORT_DAZHOU = "dazhou"; // 达州
    public final static String SHORT_YA = "ya"; // 雅安
    public final static String SHORT_BAZHONG = "bazhong"; // 巴中
    public final static String SHORT_BAZ = "baz"; // 巴州
    public final static String SHORT_ZY = "zy"; // 资阳
    public final static String SHORT_AB = "ab"; // 阿坝
    public final static String SHORT_GANZI = "ganzi"; // 甘孜
    public final static String SHORT_LIANGSHAN = "liangshan"; // 凉山
    public final static String SHORT_XICHANG = "xichang"; // 西昌
    public final static String SHORT_GY = "gy"; // 贵阳
    public final static String SHORT_LPS = "lps"; // 六盘水
    public final static String SHORT_ZUNYI = "zunyi"; // 遵义
    public final static String SHORT_ANSHUN = "anshun"; // 安顺
    public final static String SHORT_TR = "tr"; // 铜仁
    public final static String SHORT_QXN = "qxn"; // 黔西南
    public final static String SHORT_BIJIE = "bijie"; // 毕节
    public final static String SHORT_QDN = "qdn"; // 黔东南
    public final static String SHORT_QN = "qn"; // 黔南
    public final static String SHORT_KM = "km"; // 昆明
    public final static String SHORT_QJ = "qj"; // 曲靖
    public final static String SHORT_YX = "yx"; // 玉溪
    public final static String SHORT_BS = "bs"; // 保山
    public final static String SHORT_ZT = "zt"; // 昭通
    public final static String SHORT_LJ = "lj"; // 丽江
    public final static String SHORT_PE = "pe"; // 普洱
    public final static String SHORT_LINCANG = "lincang"; // 临沧
    public final static String SHORT_CX = "cx"; // 楚雄
    public final static String SHORT_HONGHE = "honghe"; // 红河
    public final static String SHORT_WS = "ws"; // 文山
    public final static String SHORT_BN = "bn"; // 西双版纳
    public final static String SHORT_DALI = "dali"; // 大理
    public final static String SHORT_DH = "dh"; // 德宏
    public final static String SHORT_NUJIANG = "nujiang"; // 怒江
    public final static String SHORT_DIQING = "diqing"; // 迪庆
    public final static String SHORT_XGLL = "xgll"; // 香格里拉
    public final static String SHORT_LASA = "lasa"; // 拉萨
    public final static String SHORT_CHANGDU = "changdu"; // 昌都
    public final static String SHORT_SN = "sn"; // 山南
    public final static String SHORT_RKZ = "rkz"; // 日喀则
    public final static String SHORT_NQ = "nq"; // 那曲
    public final static String SHORT_AL = "al"; // 阿里
    public final static String SHORT_LINZHI = "linzhi"; // 林芝
    public final static String SHORT_XA = "xa"; // 西安
    public final static String SHORT_TC = "tc"; // 铜川
    public final static String SHORT_BAOJI = "baoji"; // 宝鸡
    public final static String SHORT_XIANYANG = "xianyang"; // 咸阳
    public final static String SHORT_WN = "wn"; // 渭南
    public final static String SHORT_YANAN = "yanan"; // 延安
    public final static String SHORT_HANZHONG = "hanzhong"; // 汉中
    public final static String SHORT_YL = "yl"; // 榆林
    public final static String SHORT_ANKANG = "ankang"; // 安康
    public final static String SHORT_SL = "sl"; // 商洛
    public final static String SHORT_LZ = "lz"; // 兰州
    public final static String SHORT_JYG = "jyg"; // 嘉峪关
    public final static String SHORT_JINCHANG = "jinchang"; // 金昌
    public final static String SHORT_BY = "by"; // 白银
    public final static String SHORT_TIANSHUI = "tianshui"; // 天水
    public final static String SHORT_WUWEI = "wuwei"; // 武威
    public final static String SHORT_ZHANGYE = "zhangye"; // 张掖
    public final static String SHORT_PL = "pl"; // 平凉
    public final static String SHORT_JQ = "jq"; // 酒泉
    public final static String SHORT_QINGYANG = "qingyang"; // 庆阳
    public final static String SHORT_DX = "dx"; // 定西
    public final static String SHORT_LN = "ln"; // 陇南
    public final static String SHORT_LINXIA = "linxia"; // 临夏
    public final static String SHORT_GN = "gn"; // 甘南
    public final static String SHORT_XN = "xn"; // 西宁
    public final static String SHORT_HAIDONG = "haidong"; // 海东
    public final static String SHORT_HAIBEI = "haibei"; // 海北
    public final static String SHORT_HUANGNAN = "huangnan"; // 黄南
    public final static String SHORT_HNZ = "hnz"; // 海南
    public final static String SHORT_GUOLUO = "guoluo"; // 果洛
    public final static String SHORT_YS = "ys"; // 玉树
    public final static String SHORT_HX = "hx"; // 海西
    public final static String SHORT_YINCHUAN = "yinchuan"; // 银川
    public final static String SHORT_SZS = "szs"; // 石嘴山
    public final static String SHORT_WUZHONG = "wuzhong"; // 吴忠
    public final static String SHORT_GUYUAN = "guyuan"; // 固原
    public final static String SHORT_ZW = "zw"; // 中卫
    public final static String SHORT_XJ = "xj"; // 乌鲁木齐
    public final static String SHORT_KLMY = "klmy"; // 克拉玛依
    public final static String SHORT_TLF = "tlf"; // 吐鲁番
    public final static String SHORT_HAMI = "hami"; // 哈密
    public final static String SHORT_CHANGJI = "changji"; // 昌吉
    public final static String SHORT_BETL = "betl"; // 博尔塔拉
    public final static String SHORT_BAYINGUOLENG = "bayinguoleng"; // 巴音郭楞
    public final static String SHORT_AKS = "aks"; // 阿克苏
    public final static String SHORT_KZ = "kz"; // 克孜勒苏
    public final static String SHORT_KS = "ks"; // 喀什
    public final static String SHORT_HT = "ht"; // 和田
    public final static String SHORT_YILI = "yili"; // 伊犁
    public final static String SHORT_TAC = "tac"; // 塔城
    public final static String SHORT_ALT = "alt"; // 阿勒泰
    public final static String SHORT_SHZ = "shz"; // 石河子
    public final static String SHORT_ALAER = "alaer"; // 阿拉尔
    public final static String SHORT_TUMUSHUKE = "tumushuke"; // 图木舒克
    public final static String SHORT_WUJIAQU = "wujiaqu"; // 五家渠
    public final static String SHORT_TB = "tb"; // 台北
    public final static String SHORT_GAOXIONG = "gaoxiong"; // 高雄
    public final static String SHORT_TAIZHONG = "taizhong"; // 台中
    public final static String SHORT_PD = "pd"; // 屏东
    public final static String SHORT_KD = "kd"; // 垦丁
    public final static String SHORT_HUALIAN = "hualian"; // 花莲
    public final static String SHORT_HK = "hk"; // 香港
    public final static String SHORT_AM = "am"; // 澳门
    public final static String SHORT_NEWYORK = "newyork"; // 纽约
    public final static String SHORT_LOSANGELES = "losangeles"; // 洛杉矶
    public final static String SHORT_SANFRANCISCO = "sanfrancisco"; // 旧金山
    public final static String SHORT_PHOENIX = "phoenix"; // 凤凰城
    public final static String SHORT_SEATTLE = "seattle"; // 西雅图
    public final static String SHORT_HAWAII = "hawaii"; // 夏威夷
    public final static String SHORT_LONDON = "london"; // 伦敦
    public final static String SHORT_MANCHESTER = "manchester"; // 曼彻斯特
    public final static String SHORT_EDINBURGH = "edinburgh"; // 爱丁堡
    public final static String SHORT_MOSCOW = "moscow"; // 莫斯科
    public final static String SHORT_SAINTPETERSBURG = "saintpetersburg"; // 圣彼得堡
    public final static String SHORT_VANCOUVER = "vancouver"; // 温哥华
    public final static String SHORT_AUCKLAND = "auckland"; // 奥克兰
    public final static String SHORT_SYDNEY = "sydney"; // 悉尼
    public final static String SHORT_MELBOURNE = "melbourne"; // 墨尔本
    public final static String SHORT_TOKYO = "tokyo"; // 东京
    public final static String SHORT_OSAKA = "osaka"; // 大阪
    public final static String SHORT_SEOUL = "seoul"; // 首尔
    public final static String SHORT_BUSAN = "busan"; // 釜山
    public final static String SHORT_JEJU = "jeju"; // 济州
    public final static String SHORT_SINGAPORE = "singapore"; // 新加坡
    public final static String SHORT_KUALALUMPUR = "kualalumpur"; // 吉隆坡
    public final static String SHORT_DUBAI = "dubai"; // 迪拜
    public final static String SHORT_BANGKOK = "bangkok"; // 曼谷
    public final static String SHORT_BALI = "bali"; // 巴厘岛
    public final static String SHORT_PARIS = "paris"; // 巴黎

    private final static Map<String, String> CITY_MAP = new HashMap<String, String>(){{
        put("北京", "bj");
        put("天津", "tj");
        put("石家庄", "sjz");
        put("唐山", "ts");
        put("秦皇岛", "qhd");
        put("邯郸", "hd");
        put("邢台", "xt");
        put("保定", "baod");
        put("张家口", "zjk");
        put("承德", "chengde");
        put("沧州", "cangzhou");
        put("廊坊", "lf");
        put("衡水", "hs");
        put("太原", "ty");
        put("大同", "dt");
        put("阳泉", "yq");
        put("长治", "changzhi");
        put("晋城", "jincheng");
        put("朔州", "shuozhou");
        put("晋中", "jz");
        put("平遥", "py");
        put("运城", "yuncheng");
        put("忻州", "xinzhou");
        put("临汾", "linfen");
        put("吕梁", "lvliang");
        put("呼和浩特", "hu");
        put("包头", "bt");
        put("乌海", "wuhai");
        put("赤峰", "chifeng");
        put("通辽", "tongliao");
        put("鄂尔多斯", "erds");
        put("呼伦贝尔", "hlbe");
        put("满洲里", "manzl");
        put("巴彦淖尔", "byne");
        put("乌兰察布", "wlcb");
        put("兴安盟", "xan");
        put("锡林郭勒", "xlgl");
        put("阿拉善盟", "als");
        put("沈阳", "sy");
        put("大连", "dl");
        put("鞍山", "as");
        put("抚顺", "fushun");
        put("本溪", "benxi");
        put("丹东", "dandong");
        put("锦州", "jinzhou");
        put("营口", "yk");
        put("阜新", "fx");
        put("辽阳", "liaoyang");
        put("盘锦", "pj");
        put("铁岭", "tl");
        put("朝阳", "cy");
        put("葫芦岛", "hld");
        put("长春", "cc");
        put("吉林", "jl");
        put("四平", "sp");
        put("辽源", "liaoyuan");
        put("通化", "th");
        put("白山", "baishan");
        put("松原", "songyuan");
        put("白城", "bc");
        put("延边", "yanbian");
        put("哈尔滨", "hrb");
        put("齐齐哈尔", "qqhr");
        put("鸡西", "jixi");
        put("鹤岗", "hegang");
        put("双鸭山", "sys");
        put("大庆", "dq");
        put("伊春", "yich");
        put("佳木斯", "jms");
        put("七台河", "qth");
        put("牡丹江", "mdj");
        put("黑河", "heihe");
        put("绥化", "suihua");
        put("大兴安岭", "dxal");
        put("上海", "sh");
        put("南京", "nj");
        put("无锡", "wx");
        put("江阴", "jiangyin");
        put("徐州", "xz");
        put("常州", "cz");
        put("溧阳", "liyang");
        put("苏州", "su");
        put("昆山", "kunshan");
        put("南通", "nt");
        put("连云港", "lyg");
        put("淮安", "ha");
        put("盐城", "yancheng");
        put("扬州", "yz");
        put("镇江", "zj");
        put("泰州", "taizhou");
        put("宿迁", "suqian");
        put("杭州", "hz");
        put("宁波", "nb");
        put("温州", "wz");
        put("嘉兴", "jx");
        put("湖州", "huzhou");
        put("绍兴", "sx");
        put("金华", "jh");
        put("义乌", "yiwu");
        put("衢州", "quzhou");
        put("舟山", "zhoushan");
        put("台州", "tz");
        put("丽水", "lishui");
        put("合肥", "hf");
        put("芜湖", "wuhu");
        put("蚌埠", "bengbu");
        put("淮南", "hn");
        put("马鞍山", "mas");
        put("淮北", "huaibei");
        put("铜陵", "tongling");
        put("安庆", "anqing");
        put("黄山", "huangshan");
        put("滁州", "chuzhou");
        put("阜阳", "fy");
        put("宿州", "suzhousz");
        put("巢湖", "ch");
        put("六安", "la");
        put("亳州", "bozhou");
        put("池州", "chizhou");
        put("宣城", "xuancheng");
        put("福州", "fz");
        put("厦门", "xm");
        put("莆田", "pt");
        put("三明", "sm");
        put("泉州", "qz");
        put("漳州", "zhangzhou");
        put("南平", "np");
        put("武夷山", "wys");
        put("龙岩", "ly");
        put("宁德", "nd");
        put("南昌", "nc");
        put("景德镇", "jdz");
        put("萍乡", "px");
        put("九江", "jj");
        put("新余", "xinyu");
        put("鹰潭", "yingtan");
        put("赣州", "ganzhou");
        put("吉安", "ja");
        put("宜春", "yichun");
        put("抚州", "fuz");
        put("上饶", "sr");
        put("济南", "jn");
        put("青岛", "qd");
        put("淄博", "zb");
        put("枣庄", "zaozhuang");
        put("东营", "dy");
        put("烟台", "yt");
        put("潍坊", "wf");
        put("济宁", "jining");
        put("曲阜", "qf");
        put("泰安", "ta");
        put("威海", "weihai");
        put("日照", "rizhao");
        put("莱芜", "lw");
        put("临沂", "linyi");
        put("德州", "dz");
        put("聊城", "lc");
        put("滨州", "bz");
        put("菏泽", "heze");
        put("郑州", "zz");
        put("登封", "df");
        put("开封", "kaifeng");
        put("洛阳", "luoyang");
        put("平顶山", "pds");
        put("安阳", "ay");
        put("鹤壁", "hb");
        put("新乡", "xx");
        put("焦作", "jiaozuo");
        put("濮阳", "puyang");
        put("许昌", "xc");
        put("漯河", "luohe");
        put("三门峡", "smx");
        put("南阳", "ny");
        put("商丘", "sq");
        put("信阳", "xy");
        put("周口", "zk");
        put("驻马店", "zmd");
        put("济源", "jiyuan");
        put("武汉", "wh");
        put("黄石", "hshi");
        put("十堰", "shiyan");
        put("宜昌", "yc");
        put("襄阳", "xf");
        put("鄂州", "ez");
        put("荆门", "jingmen");
        put("孝感", "xiaogan");
        put("荆州", "jingzhou");
        put("黄冈", "hg");
        put("咸宁", "xianning");
        put("随州", "suizhou");
        put("恩施", "es");
        put("仙桃", "xiantao");
        put("潜江", "qianjiang");
        put("天门", "tianmen");
        put("神农架", "shennongjia");
        put("长沙", "chs");
        put("株洲", "zhuzhou");
        put("湘潭", "xiangtan");
        put("衡阳", "hy");
        put("邵阳", "shaoyang");
        put("岳阳", "yy");
        put("常德", "changde");
        put("张家界", "zjj");
        put("益阳", "yiyang");
        put("郴州", "chenzhou");
        put("永州", "yongzhou");
        put("怀化", "hh");
        put("娄底", "ld");
        put("湘西", "xiangxi");
        put("广州", "gz");
        put("韶关", "sg");
        put("深圳", "sz");
        put("珠海", "zh");
        put("汕头", "st");
        put("佛山", "fs");
        put("顺德", "sd");
        put("江门", "jm");
        put("湛江", "zhanjiang");
        put("茂名", "mm");
        put("肇庆", "zq");
        put("惠州", "huizhou");
        put("梅州", "mz");
        put("汕尾", "sw");
        put("河源", "heyuan");
        put("阳江", "yj");
        put("清远", "qingyuan");
        put("东莞", "dg");
        put("中山", "zs");
        put("潮州", "chaozhou");
        put("揭阳", "jy");
        put("云浮", "yf");
        put("南宁", "nn");
        put("柳州", "liuzhou");
        put("桂林", "gl");
        put("阳朔", "yangshuo");
        put("梧州", "wuzhou");
        put("北海", "bh");
        put("防城港", "fcg");
        put("钦州", "qinzhou");
        put("贵港", "gg");
        put("玉林", "yulin");
        put("百色", "baise");
        put("贺州", "hezhou");
        put("河池", "hc");
        put("来宾", "lb");
        put("崇左", "chongzuo");
        put("海口", "haikou");
        put("三亚", "sanya");
        put("三沙", "sansha");
        put("五指山", "wzs");
        put("琼海", "qionghai");
        put("儋州", "danzhou");
        put("文昌", "wenchang");
        put("万宁", "wanning");
        put("东方", "dongfang");
        put("定安", "dingan");
        put("屯昌", "tunchang");
        put("澄迈", "chengmai");
        put("临高", "lingao");
        put("白沙", "baisha");
        put("乐东", "ledong");
        put("陵水", "lingshui");
        put("保亭", "baoting");
        put("琼中", "qiongzhong");
        put("重庆", "cq");
        put("成都", "cd");
        put("都江堰", "djy");
        put("自贡", "zg");
        put("攀枝花", "panzhihua");
        put("泸州", "luzhou");
        put("德阳", "deyang");
        put("广汉", "gh");
        put("绵阳", "mianyang");
        put("广元", "guangyuan");
        put("遂宁", "suining");
        put("内江", "scnj");
        put("乐山", "ls");
        put("峨眉山", "ems");
        put("南充", "nanchong");
        put("眉山", "ms");
        put("宜宾", "yb");
        put("广安", "ga");
        put("达州", "dazhou");
        put("雅安", "ya");
        put("巴中", "bazhong");
        put("巴州", "baz");
        put("资阳", "zy");
        put("阿坝", "ab");
        put("甘孜", "ganzi");
        put("凉山", "liangshan");
        put("西昌", "xichang");
        put("贵阳", "gy");
        put("六盘水", "lps");
        put("遵义", "zunyi");
        put("安顺", "anshun");
        put("铜仁", "tr");
        put("黔西南", "qxn");
        put("毕节", "bijie");
        put("黔东南", "qdn");
        put("黔南", "qn");
        put("昆明", "km");
        put("曲靖", "qj");
        put("玉溪", "yx");
        put("保山", "bs");
        put("昭通", "zt");
        put("丽江", "lj");
        put("普洱", "pe");
        put("临沧", "lincang");
        put("楚雄", "cx");
        put("红河", "honghe");
        put("文山", "ws");
        put("西双版纳", "bn");
        put("大理", "dali");
        put("德宏", "dh");
        put("怒江", "nujiang");
        put("迪庆", "diqing");
        put("香格里拉", "xgll");
        put("拉萨", "lasa");
        put("昌都", "changdu");
        put("山南", "sn");
        put("日喀则", "rkz");
        put("那曲", "nq");
        put("阿里", "al");
        put("林芝", "linzhi");
        put("西安", "xa");
        put("铜川", "tc");
        put("宝鸡", "baoji");
        put("咸阳", "xianyang");
        put("渭南", "wn");
        put("延安", "yanan");
        put("汉中", "hanzhong");
        put("榆林", "yl");
        put("安康", "ankang");
        put("商洛", "sl");
        put("兰州", "lz");
        put("嘉峪关", "jyg");
        put("金昌", "jinchang");
        put("白银", "by");
        put("天水", "tianshui");
        put("武威", "wuwei");
        put("张掖", "zhangye");
        put("平凉", "pl");
        put("酒泉", "jq");
        put("庆阳", "qingyang");
        put("定西", "dx");
        put("陇南", "ln");
        put("临夏", "linxia");
        put("甘南", "gn");
        put("西宁", "xn");
        put("海东", "haidong");
        put("海北", "haibei");
        put("黄南", "huangnan");
        put("海南", "hnz");
        put("果洛", "guoluo");
        put("玉树", "ys");
        put("海西", "hx");
        put("银川", "yinchuan");
        put("石嘴山", "szs");
        put("吴忠", "wuzhong");
        put("固原", "guyuan");
        put("中卫", "zw");
        put("乌鲁木齐", "xj");
        put("克拉玛依", "klmy");
        put("吐鲁番", "tlf");
        put("哈密", "hami");
        put("昌吉", "changji");
        put("博尔塔拉", "betl");
        put("巴音郭楞", "bayinguoleng");
        put("阿克苏", "aks");
        put("克孜勒苏", "kz");
        put("喀什", "ks");
        put("和田", "ht");
        put("伊犁", "yili");
        put("塔城", "tac");
        put("阿勒泰", "alt");
        put("石河子", "shz");
        put("阿拉尔", "alaer");
        put("图木舒克", "tumushuke");
        put("五家渠", "wujiaqu");
        put("台北", "tb");
        put("高雄", "gaoxiong");
        put("台中", "taizhong");
        put("屏东", "pd");
        put("垦丁", "kd");
        put("花莲", "hualian");
        put("香港", "hk");
        put("澳门", "am");
        put("纽约", "newyork");
        put("洛杉矶", "losangeles");
        put("旧金山", "sanfrancisco");
        put("凤凰城", "phoenix");
        put("西雅图", "seattle");
        put("夏威夷", "hawaii");
        put("伦敦", "london");
        put("曼彻斯特", "manchester");
        put("爱丁堡", "edinburgh");
        put("莫斯科", "moscow");
        put("圣彼得堡", "saintpetersburg");
        put("温哥华", "vancouver");
        put("奥克兰", "auckland");
        put("悉尼", "sydney");
        put("墨尔本", "melbourne");
        put("东京", "tokyo");
        put("大阪", "osaka");
        put("首尔", "seoul");
        put("釜山", "busan");
        put("济州", "jeju");
        put("新加坡", "singapore");
        put("吉隆坡", "kualalumpur");
        put("迪拜", "dubai");
        put("曼谷", "bangkok");
        put("巴厘岛", "bali");
        put("巴黎", "paris");
    }};

    public static String getCityName(String cityName) {
        cityName = cityName.replace("市", "");
        cityName = cityName.replace("自治区", "");
        cityName = cityName.replace("特别行政区", "");
        return cityName;
    }

    public static String getCityShort(String cityName) {
        cityName = CityInfo.getCityName(cityName);
        if(CityInfo.CITY_MAP.containsKey(cityName)) {
            return CityInfo.CITY_MAP.get(cityName);
        } else {
            return CityInfo.SHORT_BJ;
        }
    }
}
