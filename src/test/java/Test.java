import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;

public class Test
{
    @org.junit.Test
    public void test() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        JsonNode jsonNode1 = objectMapper.readTree("{\n" +
                "    \"channel_name\": \"法国国际广播电台_中国时事\",\n" +
                "    \"author\": \"\",\n" +
                "    \"pubtime\": \"2021-07-01 15:47:02\",\n" +
                "    \"title\": \"美国跨党议员再推法案 加快港人取得难民身分\",\n" +
                "    \"content\": \"美国跨党议员再推法案 加快港人取得难民身分  \"\n" +
                "}");
        String title = jsonNode1.get("title").asText();
        System.out.println("title = " + title);


        String content = "{\"channel_name\":\"法国国际广播电台_中国时事\",\"author\":\"\",\"pubtime\":\"2021-07-01 15:47:02\",\"title\":\"美国跨党议员再推法案 加快港人取得难民身分\",\"content\":\"美国跨党议员再推法案 加快港人取得难民身分              \n" +
                "  发表时间： 01/07/2021 - 09:47\n" +
                "    \n" +
                " \n" +
                "  港民集会呼吁美国国会众议院通过《香港人权与民主法案》。2019年11月\n" +
                " 路透社。\n" +
                "      作者： \n" +
                "  香港特约记者 麦燕庭  \n" +
                " 4 分钟\n" +
                "  在《港区国安法》生效一周年之日，美国两名跨党派的众议员宣布，会在周内重提《香港人民自由与选择法案2021》，争取加快给国安法威胁和中共加强箝制的港人一个难民身分，或为已身处美国的港人提供临时难民身分，以免他们被迫离境。法案同时会推动在移民政策上把香港与中国内地分隔处理，为期五年。 \n" +
                "      广告\n" +
                "  继续浏览后续\n" +
                " 民主党众议员马里诺夫斯基(Tom Malinowski)联同共和党众议员金辛格(Adam Kinzinger)周二宣布共同提出上述法案，获两党多名议员支持。法案为港人申请入境美国提供多种途径，当中包括「高技能申请者」，容许持有美国认可院校文凭人士，或者旗下企业员工人数超逾50人，又或公司资产达到5000万美元者提出申请。 另外，亦会建立策略与国际联盟，协助港人逃离迫害。\n" +
                "马里诺夫斯基指出，中共在港实施的国安法，是港人的灾难，提出法案是向北京当局表明，自由不是用来讨价还价的。若中国扼杀香港自由，将失去香港的优秀人才，美国则会从中得益。另外，金辛格表示，香港人遭到囚禁和起诉，推动国会两党议员行动，表明两党理念虽然有别，但在保障港人人权一事上团结一致，尽管仍有很多工作需要做，但此法案将是清晰的第一步。\n" +
                "《香港人民自由与选择法案》去年在众议院获通过，但在参议院遭共和党人克鲁兹阻挠，指忧虑北京会利用放宽的移民标准，向美国进行渗透，令法案未获通过。\n" +
                "   电邮新闻头条新闻就在您的每日新闻信里\n" +
                " 订阅   \n" +
                "    下载法广应用程序跟踪国际时事\n" +
                "  Download_on_the_App_Store_Badge_CNSC_RGB_blk_092917                             \n" +
                "    香港 \n" +
                " 政治 \n" +
                " 美国 \n" +
                "    同一主题\n" +
                "      香港/政治/反送中\n" +
                "香港抗议人士今天集会声援美国香港人权法案 \n" +
                "    美国/政治/中国\n" +
                "美国土安全代理部长：中共想以自己的形象重塑世界，欢迎香港难民\n" +
                "    难民\n" +
                "德国选项党剑指香港移民\"},{\"channel_name\":\"多维_首页\",\"author\":\"联合新闻网\",\"pubtime\":\"2021-07-01 15:27:00\",\"title\":\"美国新闻女主播接获诈骗电话　切换报道“专业口吻”一秒吓退疑犯\",\"content\":\"《Fox 5》报导，该台主播雷耶斯（Jeannette Reyes）最近接到电话，声称她要是没有支付名下超过2700美元（约港币2万1千元）的未结余额，就会遭到逮捕。雷耶斯心知遇上诈骗犯，顿时浮现出一个戏耍对方的计划。\n" +
                "点击下图看清女主播戏耍电话诈骗犯过程！根据雷耶斯上传社群媒体的影片，当她假作一无所知地询问诈骗犯，可否立刻清偿债务时，诈骗犯直称事情马上能解决，并要雷耶斯拿出签帐信用卡，当场支付至少2500美元。\n" +
                "雷耶斯先称卡就在她手上，当对方一要她念出信用卡的卡号，雷耶斯读出“三、二、一”，倒数完毕马上切换成播报新闻的口吻，“晚安，我们现在正在电视直播调查电话诈骗犯，联调局正在线上，就在我们讲话时，他们正在追踪这个门号。先生，你能否再说一次你的全名？”，随后就可听到雷耶斯的手机传出挂电话的嘟嘟声。\n" +
                "雷耶斯是《Fox 5晨间新闻》（FOX 5 Morning）与《日安瓦尔府》（Good Day DC）的主播，她戏耍诈骗犯的录影在Twitter与TikTok浏览数分别是160多万与500多万，同时吸引不少网友在留言分享他们接到诈骗电话的心得。\n" +
                "相关图辑：单身女子游巴黎　酒店内线竟是诈骗电话▼▼▼延伸阅读：\n" +
                "为抢镜头酿环赛大规模车祸！白目女被抓“下场惨了”北美热浪逾500死 气温屡破新高【本文获“联合新闻网”授权转载。】\"},{\"channel_name\":\"俄罗斯卫星通讯社_所有新闻\",\"author\":\"\",\"pubtime\":\"2021-07-01 15:21:00\",\"title\":\"独角兽之国：为什么中国快速增长的初创企业数量不如美国？\",\"content\":\"全球最大管理咨询公司埃森哲（Accenture）的一份报告中说，中国占全球所有快速增长的初创公司的20%。中国的字节跳动公司在市值方面继续位居独角兽公司榜首。而在此情况下，在进入商业分析平台CB洞察公司(CB Insights)榜单的728个初创公司中，有一半多公司都是美国公司。\n" +
                "美国在独角兽公司数量方面超过中国 根据CB洞察公司6月的一份报告，所有独角兽公司中有20%位于中国，其中包括146个内地公司，5个香港公司。根据胡润百富报告，2019年中国拥有的独角兽公司为全球最多。当时中国有206个独角兽公司，美国有203个独角兽公司。此后世界受到新冠病毒大流行的束缚，情况开始发生变化。\n" +
                " 中国新初创企业数量早在2020年就出现了严重下降。在新冠病毒疫情爆发使国家“瘫痪”两个多月后，全国许多企业都遭受到销售额下滑和现金流萎缩的打击。与美国的长期贸易战也对此不利。\n" +
                " 根据关注私募股权、PE\\VC\\并购的数据库及数据分析服务提供商Pitchbook公司的数据，今年前两个月，中国风险投资的活跃度急剧下降，仅进行了144笔交易，而去年同期进行了340笔交易，所募集到的资金从43亿美元同比下降到14亿美元。例如，2020年第一季度，中国初新摇篮深圳的风险投资额较去年同期下降了40%。\n" +
                " \n" +
                " © Sputnik\n" +
                "中美两国新兴独角兽 公司的数据对比\n" +
                " 中美贸易战也重创了风险投资市场，美国对中国初创企业的风险投资额从2018年的178亿美元下降到2019年的40亿美元。\n" +
                " 然而，Pitchbook公司分析师指出，甚至在新冠病毒大流行之前，由于对本土初创企业的信任减弱，风险投资业务在中国的状况就已经恶化。经过几年的活跃金融活动，投资者对多个科技公司首次公开募股（IPO）后的不良业绩感到不满，其中包括电动汽车制造商蔚来汽车和智能手机制造商小米等大公司。\n" +
                " 2018年，小米公司在港交所进行了首次公开募股，吸引到47.2亿美元，但公司的期望值是该数字的两倍——100亿美元。小米公司的市值估计为1000亿美元，在首次公开募股后为540亿美元。2018年6月，媒体援引消息人士的话报道，小米公司在香港公开募股前决定推迟在中国大陆的股票发行。之后，公司把可能估值下调到550亿美元至700亿美元之间。\n" +
                " 中国电动汽车初创企业蔚来于2018年9月在美国上市。蔚来股票以每股6美元的价格上市，比首次公开募股时的6.26美元价格下跌4.2%。首次公开募股的结果是蔚来公司吸引了10亿美元，没有达到18亿美元的既定目标。\n" +
                " 如今，CB洞察公司榜单上的美国独角兽公司数量达到374个，是中国独角兽公司的两倍多。美国占所有独角兽初创公司的51%，中国以20%位居第二，印度以5%位居第三，超过英国，英国占所有独角兽初创公司的4%。\n" +
                " 据中国人民大学重阳金融研究院研究员、合作研究部主任刘英向卫星通讯社介绍，中国独角兽公司的数量不如美国多的一个原因可能是从天使到风投整个融资体系的支撑不够强。\n" +
                "“我们确实是在大众创业、万众创新，但是给予初创企业的金融的支持和安排还不够，此外包括国际化人才的实践、高精尖的技术可以进一步提升。独角兽需要市场环境、技术支持、人才支撑、创业环境等全方位环境的培育和支撑，有了这些方能诞生世界级的独角兽企业”，刘英指出。 今天，中国正在积极试图弥补这种落后局面。为此拨出了巨额资金。例如，3月，中国科技部公布了2021年财政拨款支出预算数据。这一数字为5404亿元，比2020年的执行数增加590万元，增长12.26%。\n" +
                " 此外，刘英还指出，技术不是大问题，但是给予技术转化为成果的融资支持体系还是很重要。自从贸易摩擦以来，对中国初创企业和科技公司的美国资本有所减弱。\n" +
                " 一些事实表明，中国金融科技和科技公司整体的快速增长与其说是因为商业模式的独特性，不如说是因为缺乏监管。于是，为防范金融风险，央行出台规定，自2020年11月起，凡不具金融性质却拥有两个或以上金融部门的任何公司，应该注册为符合所有固定监管规定的金融控股公司。\n" +
                " \n" +
                " © AP Photo / Mark Schiefelbein\n" +
                "外国投资者害怕中国科技监管有可能融资是另一个问题。确实，自从中国开始积极监管互联网、金融科技和电子商务以来，对中国初创企业和科技公司的投资在减少。例如，在2018年到2019年之间，中国开始着手整顿P2P借贷系统。如果说在发展高峰期中国共有6000多个p2p平台的话，那么到2019年相关监管条例生效时，剩下的符合规则的平台数量已经下降到个位数。顺便说一句，这些监管条例整体而言只是在重复其他国家的p2p监管规定。许多p2p公司转入监管较少的消费贷行业。 随后，事实证明，中国金融科技和科技公司整体快速增长的秘密毋宁说因为商业模式的独特性，不如说是因为缺乏监管。为防范金融风险，央行出台规定，自2020年11月起，凡不具金融性质却拥有两个或以上金融部门的任何公司，应该注册为符合所有固定监管规定的金融控股公司。\n" +
                " 2021年3月，由于中国监管机构加强对各公司首次公开募股的要求，76个公司取消了在上交所科创板（STAR Market，中国版纳斯达克）的首次公开募股活动。在科创板存在的全部时间，一共记录了180个此类先例——其中40%发生在2021年3月。\n" +
                " 但刘英认为，恰恰相反，所采取的管控措施有助于应对不可预见的风险。\n" +
                "“加强监管好的方面在于，可以帮助防控金融风险，这个是很关键的。创新当然可以无边无际，但是一定要有方向，要支持实体经济发展，要以防控风险为底线，这些金融科技类企业还都要设有防火墙。不太好的方面是，如果采取一刀切的方式，没有分类监管、柔性监管和协同监管等新型监管方式，也或有可能限制一些的创新企业的成长。”刘英指出。 中国独角兽的特点 埃森哲咨询公司的分析师指出，科技公司数量的增加表明中国的投资潜力很大。她认为，中国具有有利于独角兽公司发展的环境，独角兽公司未来几年会越来越多。刘英说：\n" +
                " “首先，中国近些年的数字经济增长速度非常之快，数字经济的发展，包括它在经济中的占比等各个方面（2020年中国数字经济超过39.2万亿元，占GDP的38.6%）促进了独角兽企业的发展，而数字经济所具备的平台经济理论也促使了更多独角兽企业的诞生。” “其次，我觉得全面推行注册制改革，尤其是科创板的设立，也为这些独角兽的企业的成长壮大带来了非常好的资本市场的融资支持。” “最后但是非常重要的一点，中国目前已经成长为全球最大的消费市场，而独角兽企业的成长壮大需要巨大的市场支撑。” 此外，大部分中国独角兽初创企业都打算进入全球市场。按照埃森哲咨询公司的数据，在参与项目研究的87个公司中，有82%的公司计划在未来2年内开设海外分支机构。\n" +
                " 刘英指出，中国高水平的对外开放，营商环境的改善非常迅速，这些对独角兽企业的成长和诞生也是有非常大的好处。\n" +
                " 在CB洞察公司榜单中的728个初创公司中，两个中国公司和两个美国公司的市值位居前五名。抖音（TikTok）的所有者字节跳动公司以1400亿美元位居榜首，这家中国公司也成为人工智能类公司中市值最高的公司，是唯一一家被认为是百角兽（hectocorn）的私有公司（估计其价值超过1000亿美元）。美国金融初创公司Stripe位居第二，成为市值最大的金融科技百角兽公司——950亿美元。\n" +
                " 根据CB洞察公司的数据，金融科技是最大的类别，占所有独角兽公司的17%。排在第三位的是埃隆·马斯克名下的太空探索科技公司（SpaceX）——740亿美元，排在第四位的是中国出租车巨头滴滴出行（620亿美元），排在第五位的是瑞典金融科技公司Klarna（456亿美元）。\n" +
                " \n" +
                " © REUTERS / ALY SONG\n" +
                "中国将加大对美国的法律制裁CB洞察公司指出，自2019年以来有63%的公司加入了独角兽俱乐部（Unicorn Club）。其中，2020年有118个公司上榜。自2021年3月以来，独角兽俱乐部增长了19%，从611个增加到728个。按照这个速度，独角兽俱乐部年底前可能超过1000个初创公司。 其次是软件和互联网服务（16%）、电子商务和快递（12%），以及人工智能（8%）等类别。中国初创企业在其中占据特殊地位。\n" +
                " 在电子商务和对消费者直接递送领域，第一名是中国跨境电子商务平台Shein（150亿美元）。\n" +
                " 有32个私有公司（独角兽总数的4%）被认为是价值超过100亿美元的十角兽（Decacorn）。同时，全球独角兽俱乐部中25%的公司估值是10亿美元整——也就是说，他们刚刚加入“俱乐部”。\n" +
                " 顺便说一下，俄罗斯也有独角兽公司，尽管数量不多。根据《欧洲独角兽景观》（European unicorn landscape）的资料，例如，俄罗斯的独角兽包括在线广告服务Avito、数字巨头Yandex和社交网络VKontakte（隶属Mail.ru Group）。今天，Yandex公司在莫斯科证券交易所的市值超过1.6万亿卢布（约合220亿美元）。\"},{\"channel_name\":\"俄罗斯卫星通讯社_所有新闻\",\"author\":\"\",\"pubtime\":\"2021-07-01 15:16:00\",\"title\":\"美国从国际空间站秘密发射一颗卫星\",\"content\":\"Space-track.org网站公布的美国空军数据显示，一颗美国卫星从国际空间站悄然发射。\n" +
                "\n" +
                " © 照片 : Roscosmos / Ivan Vagner\n" +
                "美国航空航天局：“天鹅座”货运飞船脱离国际空间站消息称，该设备编号为BD-28，属于美国，从国际空间站进入轨道。这发生在什么时候，又是如何进行的，未见官方消息，但国际空间站美国舱段通常是用借助操纵装置移到空间站外面的平台发射卫星。 美国著名航天学专家乔纳森·麦克道威尔发推文称，他推测这颗卫星属于美国一家私人公司，该公司还不想大肆宣传自己的活动。\"},{\"channel_name\":\"英国金融时报_首页\",\"author\":\" 英国《金融时报》 莎拉•尼威尔 伦敦报道\",\"pubtime\":\"2021-07-01 14:59:41\",\"title\":\"英国计划9月起接种新冠疫苗加强针\",\"content\":\"英国政府的顾问们已建议，预计数以百万计年龄较大和较为脆弱的英国人将从9月开始接种新冠疫苗加强针，以增强他们在冬季的抵抗力，并抑制新变种。\n" +
                "是否推进该计划的最终决定，将在获得有关疫苗保护力持续时间的更多数据后做出。官员们表示，根据疫苗接种和免疫联合委员会(JCVI)的临时裁决，英国国家医疗服务体系(NHS)将在10周内开始为接种加强针做准备，但最终放行决定要到夏季晚些时候才会做出。\n" +
                "英国的疫苗接种计划被认为是全球最成功的疫苗接种计划之一，近85%的成年人已经接种了第一剂，逾62%的人已经完成了全部剂次接种。\n" +
                "美国等其他几个国家也在考虑是否启动加强针接种，但据信英国是首个宣布暂定支持接种加强针的国家。\n" +
                "科学和医学专家向大臣们表示，他们需要防范冬季新冠病毒再次袭击高危人群。此前卫生领导人警告称，由于去年冬天社交活动不多，流感在很大程度上得到了抑制，而今年预计将迎来一个严重的流感季。\n" +
                "英国新任卫生和社会保障大臣赛义德•贾维德(Sajid Javid)强调了国家尽快恢复正常的必要性。他说：“我们需要学会与这种病毒共存。我们的首个疫苗接种计划正在这个国家恢复（大家的）自由，而我们的加强针计划将保护这种自由。”\n" +
                "是否批准加强针接种运动的最终决定，将取决于前两剂疫苗保护时间的相关数据。科学家们确信，这种保护至少能维持6个月，但也许能持续更长时间，至少在年轻人身上是如此。\n" +
                "至于加强针应该接种与前两剂相同的疫苗，还是混合接种，疫苗接种和免疫联合委员会还没有做出最终决定。官员们表示，无论选择哪种方式，英国都将有充足的疫苗供应。\n" +
                "如果加强针计划得到推进，它将与每年定期进行的流感疫苗接种运动一同展开。流感疫苗的接种将与去年一样，面向50岁及以上的所有人。不同人群接种新冠疫苗加强针的优先次序，将与最初疫苗接种计划中的优先次序相同，让最易受重症影响的人群最先接种。\n" +
                "英格兰副首席医疗官乔纳森•文心(Jonathan Van-Tam)教授表示，能否在防疫限制较少或没有的情况下管控新冠疫情带来的威胁，目前在很大程度上取决于疫苗接种计划的持续成功。\n" +
                "他说：“我们希望先行一步，通过新冠疫苗加强针，尽可能地降低保护力下降或病毒变种导致疫苗失效的可能性，尤其是在即将到来的秋冬季节。”\n" +
                "他还表示，防疫限制较少或没有意味着其他呼吸道病毒“将卷土重来，很可能成为今年冬天的另一个问题，因此我们将需要确保预防流感，并继续预防新冠肺炎”。\n" +
                "最先需要接种加强针的是16岁以上的免疫功能低下者，他们的身体可能未对前两剂疫苗产生抗体。同样符合最先接种条件的还包括住在养老院的老年人、70岁以上人群、在临床上被认为极度脆弱的年轻人，以及一线医护人员。\n" +
                "第二批次接种对象将包括所有50岁以上的成年人，以及50岁以下通常符合每年流感疫苗接种条件或与免疫功能低下者一同生活的人。将加强针接种范围扩大到50岁以下所有人的最终决定则没有那么紧迫，因为他们接种前两剂疫苗的时间较晚，整个冬天疫苗在他们身上都将保持保护力。\n" +
                "疫苗接种和免疫联合委员会的新冠部门负责人Wei Shen Lim表示，该委员会将“在未来几个月继续审核新出现的科学数据，包括当前疫苗保护力持续时间的相关数据。我们有关接种疫苗加强针的最终建议可能发生很大变化。”\n" +
                "译者/何黎\"}";
        JsonNode jsonNode = objectMapper.readTree(content);

        String pubtime = jsonNode.get("pubtime").asText();
        System.out.println("pubtime = " + pubtime);
    }
}
