/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : iread

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-07-29 19:11:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` char(36) NOT NULL,
  `user_id` char(11) NOT NULL,
  `title` varchar(40) NOT NULL,
  `content` text,
  `look_num` int(11) DEFAULT '0',
  `comment_num` int(11) DEFAULT '0',
  `like_num` int(11) DEFAULT '0',
  `create_time` datetime NOT NULL,
  `is_visible` tinyint(1) unsigned zerofill DEFAULT '0',
  `is_display` tinyint(1) unsigned zerofill DEFAULT '0',
  `book_img_path` varchar(255) DEFAULT NULL,
  `audio_path` varchar(255) DEFAULT NULL,
  `audio_duration` int(11) unsigned zerofill DEFAULT '00000000000' COMMENT '音频时长，单位为秒',
  `audio_info` varchar(255) DEFAULT NULL COMMENT '音频简介',
  `abstract_info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('0b8e9b65-4edb-4cb2-a351-631bfb5169a6', '18487292365', '去去去', '<p>请输入内容...</p><p>www</p>', null, null, null, '2017-04-19 20:25:03', null, null, null, null, null, null, '请输入内容...www');
INSERT INTO `article` VALUES ('1740cdb5-cb9d-4b2e-ba4b-ffbc361dd08c', '18487292365', '客户端测试', '<p>请输入内容...</p><p>内容，没有附件</p>', '1', null, null, '2017-04-20 00:27:04', null, null, null, '', null, null, '请输入内容...内容，没有附件');
INSERT INTO `article` VALUES ('1978e4a5-b378-47fa-a0bc-de3dae04e297', '18487292365', '白夜行：有种恶，无法救赎，也无从终结', '<h3 style=\"margin-bottom: 20px; word-break: break-word;\" class=\"\"><font color=\"#2f2f2f\" face=\"sans-serif\"><span style=\"font-size: 17px; white-space: pre-wrap;\" class=\"\">不管是雪穗，还是桐原，他们的恶行，都无法被救赎，也无法终止，除非他们在这个世界上消失。\n\n无法被救赎，是因为没有人能走进他们深沉而黑暗的世界。\n\n无法终止，是因为他们不允许，也不能让别人看到他们的黑暗世界。\n\n生活在黑暗中，是他们的悲剧性命运使然。\n\n而造成他们命运悲剧的，又是我们社会里其他人的恶行。他们是恶之花，更是恶之果。\n\n深刻的悲剧，不仅在于我们能够理解他人命运之乖张颠簸，让我们能感同身受，更在于让我们洞察到酿成悲剧的人类固有的人性缺憾，使我们在面对这个世界时，能够多一份明悟，多一丝慈悲。</span></font><br></h3>', '7', null, null, '2017-04-20 11:01:42', null, null, 'fa7c3068-ae80-4a14-aaa9-03c4538a2390.jpg', '', null, '深切的绝望和悲哀，现实总是绝望而残酷，如果知道真相如此，是否能原谅那两个只能在夜里行走的人……', '不管是雪穗，还是桐原，他们的恶行，都无法被救赎，也无法终止，除非他们在这个世界上消失。\n\n无法被救赎，是因为没有人能走进他们深沉而黑暗的世界。\n\n无法终止，是因为他们不允许，也不能让别人看到他们的黑暗世界。\n\n生活在黑暗中，是他们的悲剧性命运使然。\n\n而造成他们命运悲剧的，又是我们社会里其他人的恶行。他们是恶之花，更是恶之果。\n\n深刻的悲剧，不仅在于我们能够理解他人命运之乖张颠簸，让我们能感同身受，更在于让我们洞察到酿成悲剧的人类固有的人性缺憾，使我们在面对这个世界时，能够多一份明悟，多一丝慈悲。');
INSERT INTO `article` VALUES ('29575986-89db-4881-8c0b-751bb8a248b9', '18487292365', '她来时有风', '<p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>我所希冀的生活不是成为诗，而是在每一个温柔的清晨睡到自然醒。<br></i></p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>拉开窗帘是洒满整个古城的阳光。</i></p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>我们三五成群，骑着电动车环绕过一条又一条小巷，依海而歌，头顶着日光写作。</i></p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>你从远方赶来，恰巧我也在。</i></p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>你有你的故事，我有我的固执，谁也不要评判谁。</i></p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\"><i>每个人都是一个世界。</i></p>', '3', null, null, '2017-04-20 10:44:02', null, null, 'da3f190e-7713-41a9-a29c-77032e5c0f08.jpg', 'a2690aac-7777-4fa6-9cfc-e923965869d0.aac', '00000000005', '山有清风，水有明月。\n\n而我，有你。', '我所希冀的生活不是成为诗，而是在每一个温柔的清晨睡到自然醒。拉开窗帘是洒满整个古城的阳光。我们三五成群，骑着电动车环绕过一条又一条小巷，依海而歌，头顶着日光写作。');
INSERT INTO `article` VALUES ('39d64242-69ef-4853-9339-6667e82e1131', '18487292365', '她来时有风', '<p>请输入内容...</p><p><br></p>', null, null, null, '2017-04-20 10:35:56', null, null, '40098f59-d8a6-45fd-9cd4-3ecdf73524e5.jpg', 'ee6cdf21-6e5e-42c0-b1a3-0344f6ff5bbb.aac', '00000000003', '我所希冀的生活不是成为诗，而是在每一个温柔的清晨睡到自然醒。\n\n拉开窗帘是洒满整个古城的阳光。\n\n我们三五成群，骑着电动车环绕过一条又一条小巷，依海而歌，头顶着日光写作。\n\n你从远方赶来，恰巧我也在。\n\n你有你的故事，我有我的固执，谁也不要评判谁。\n\n每个人都是一个世界。', '请输入内容...');
INSERT INTO `article` VALUES ('7b65c840-b370-494c-822d-d99de89c28eb', '18487292365', '嫌疑人x的献身：越是无声的爱，越是汹涌', '<p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">他已经无法翻越那座山，只能走下山的路。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">这种感觉，每个人可能或多或少都有所体会，特别对于搞创作的人而言，你无法再突破自己曾经的作品和成就时，你所挚爱的东西，将会成为你最惧怕的东西。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">而你又不找到能够替代它到东西，于是只能日复一日，独自在山林里徘徊。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">那种孤独，就是绝望。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">而在他绝望的时候，陈婧带着女儿，按响门铃，让他重获新生。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">所以，他不惜伤害一个无辜的人，将自己变成一个变态跟踪狂，也要保护陈婧。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">如他所言，这不是报仇，而是报恩。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">他知道他和陈婧不是一路人，所以永远都不会走在一条路上。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">陈婧感激他，却无法爱上或接受他，甚至在即将获得幸福时，希望忘记曾和他一起经历过得那件事。</p><p style=\"margin-bottom: 20px; word-break: break-word; white-space: pre-wrap; color: rgb(47, 47, 47); font-family: sans-serif; font-size: 17px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">这何曾又不是另一种绝望？</p>', '1', null, null, '2017-04-20 00:41:03', null, null, '0228122e-c403-4548-822d-58140aea6f93.jpg', '', null, '', '他已经无法翻越那座山，只能走下山的路。这种感觉，每个人可能或多或少都有所体会，特别对于搞创作的人而言，你无法再突破自己曾经的作品和成就时，你所挚爱的东西，将会成为你最惧怕的东西。而你又不找到能够替代它到东西，于是只能日复一日，独自在山林里徘徊。那种孤独，就是绝望。');
INSERT INTO `article` VALUES ('8c1cae9f-647e-4162-89b8-4aa9a7430d31', '18487292365', '去去去', '<p>请输入内容...</p><p>www</p>', null, null, null, '2017-04-19 20:27:19', null, null, null, null, null, null, '请输入内容...www');
INSERT INTO `article` VALUES ('93c1681f-3e46-443b-93e4-c325cb5df634', '18487292360', '嫌疑人X的献身：越是无声的爱，越是汹涌', '<p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">我并不是这部小说的原著党，同时也有一些庆幸，不然我会一直苦于寻找原著的情节，一个劲的脑海中追问曾那个曾经深深打动我的地方在哪里？<br></p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">在评价这部电影之前，我想说说，关于作品改编的事情。</p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">我们对于改编的幻想是，选定一个作品，然后将其简单地转换成一个剧本，就大功告成。</p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">其实小说故事和荧幕故事，本身就是两个故事。</p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">改编的艰难程度，远远超过重新创造一个故事，正如《余罪》的编剧曾和原著作者撕过一次，原著作者责怪编剧更改大多的情节，而编剧表示不背这个锅。</p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">正如大多编剧不愿做IP改编的书，要维系故事本身的脊梁，又要敲碎故事本身的框架，重新创造出一个符合荧幕的故事。</p><p style=\"margin-bottom: 25px; word-break: break-word; color: rgb(47, 47, 47); font-family: -apple-system, &quot;SF UI Text&quot;, Arial, &quot;PingFang SC&quot;, &quot;Hiragino Sans GB&quot;, &quot;Microsoft YaHei&quot;, &quot;WenQuanYi Micro Hei&quot;, sans-serif; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: normal;\">因为银幕上，关于人物的内心世界，那些细微的感情，都无法透过文字传递，任何一个拍摄手法、演员表演形式的不同都可能导致整部电影和原著出现偏差。</p>', '1', null, null, '2017-04-19 14:29:21', null, null, '', '', null, '', '银幕上，关于人物的内心世界，那些细微的感情，都无法透过文字传递，任何一个拍摄手法、演员表演形式的不同都可能导致整部电影和原著出现偏差。');
INSERT INTO `article` VALUES ('a958bd37-ec78-4ebb-b0c4-28fc7d03b654', '18487292365', '去去去', '<p>请输入内容...</p><p>www</p>', null, null, null, '2017-04-19 20:22:51', null, null, null, null, null, null, '请输入内容...www');
INSERT INTO `article` VALUES ('db82b991-d982-430f-b962-e106039257b6', '18487292365', '去去去', '<p>请输入内容...</p><p>www</p>', null, null, null, '2017-04-19 22:37:46', null, null, null, null, null, null, '请输入内容...www');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `user_id` char(11) NOT NULL,
  `subject_id` char(36) NOT NULL COMMENT '收藏，即喜欢，喜欢文章，评论，专栏（订阅），专栏文章，',
  `type` tinyint(1) NOT NULL COMMENT '0/1/2/3--文章，推荐，专栏文章，专栏（订阅）',
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`user_id`,`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES ('18487292360', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', '2017-04-15 10:12:03');
INSERT INTO `collect` VALUES ('18487292360', '137de17b-943d-44dc-a435-de7ad725535d', '3', '2017-04-21 17:26:06');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` char(36) NOT NULL,
  `user_id` char(11) NOT NULL,
  `subject_id` char(36) NOT NULL COMMENT '评论对象',
  `type` tinyint(1) NOT NULL,
  `content` varchar(255) NOT NULL,
  `parent_id` char(36) DEFAULT NULL,
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `is_visible` tinyint(1) unsigned zerofill NOT NULL DEFAULT '0' COMMENT '留言板显示部分内容，默认0，显示',
  `is_replay` tinyint(1) unsigned zerofill NOT NULL DEFAULT '0' COMMENT '是否可回复，不可回复为留言，默认0，可回复',
  `like_num` int(11) unsigned zerofill DEFAULT NULL COMMENT '点赞数，只有留言板有点赞',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('0aa913c5-f32f-4f9a-a0c7-d94fdca74033', '18587292360', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', 'test多条评论', null, '2017-04-16 14:20:38', '0', '0', null);
INSERT INTO `comment` VALUES ('0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '18487292365', '99bfb9ef-a634-48a2-98fc-87eec8418e59', '1', '越接近真相越是绝望', null, '2017-04-15 10:12:03', '0', '0', null);
INSERT INTO `comment` VALUES ('0ce913c5-f32f-4f9a-a0c7-d94fdca75555', '18487292365', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', '目送', 'd94fdca74032', '2017-04-16 10:12:03', '0', '0', null);
INSERT INTO `comment` VALUES ('2ab66c1b-09f2-4da4-894b-dfb988f665d4', '18487292360', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', '测试回复', '524291a0-09a5-4379-9661-3185cff036bb', '2017-04-17 13:11:32', '1', '1', null);
INSERT INTO `comment` VALUES ('524291a0-09a5-4379-9661-3185cff036bb', '18487292360', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', '测试评论', null, '2017-04-17 13:10:06', '1', '1', null);
INSERT INTO `comment` VALUES ('5c91e2c4-771a-4b2c-b2ea-f69c7a5a0c13', '18487292360', '1978e4a5-b378-47fa-a0bc-de3dae04e297', '1', '白夜行很好看', null, '2017-04-27 18:07:18', '1', '1', null);
INSERT INTO `comment` VALUES ('6152b7ee-f456-4a1b-a98a-8d5c99817227', '18487292365', '93c1681f-3e46-443b-93e4-c325cb5df634', '1', '那我应该去看看', null, '2017-04-20 19:01:30', '1', '1', null);
INSERT INTO `comment` VALUES ('69d3ceb6-8c44-44a3-8931-0d79745a2c1a', '18487292365', '93c1681f-3e46-443b-93e4-c325cb5df634', '1', '还不错', '6152b7ee-f456-4a1b-a98a-8d5c99817227', '2017-04-20 19:05:35', '1', '1', null);
INSERT INTO `comment` VALUES ('7342d5b2-9933-47ae-89c8-756a1cad6a19', '18487292365', '1978e4a5-b378-47fa-a0bc-de3dae04e297', '1', '有种恶，无法被救赎，也无从终结...', null, '2017-04-20 19:32:06', '1', '1', null);
INSERT INTO `comment` VALUES ('d94fdca74032', '18487292360', '0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '1', '评论', null, '2017-04-15 10:12:03', '0', '0', null);
INSERT INTO `comment` VALUES ('efee49e2-e0ed-4273-9372-06d305b86e9c', '18487292365', '1978e4a5-b378-47fa-a0bc-de3dae04e297', '1', '越接近真相，越让人绝望', null, '2017-04-20 19:38:28', '1', '1', null);
INSERT INTO `comment` VALUES ('fe6e9362-1a08-4f60-b6c1-e52ebd65c78d', '18487292360', 'f3d20e3e-1e43-4f50-a93b-457bc75e44e6', '1', '还不错，张嘉佳的小说感觉很真实', null, '2017-04-27 18:09:37', '1', '1', null);

-- ----------------------------
-- Table structure for focus
-- ----------------------------
DROP TABLE IF EXISTS `focus`;
CREATE TABLE `focus` (
  `user1_id` char(11) NOT NULL,
  `user2_id` char(11) NOT NULL,
  `create_time` datetime NOT NULL COMMENT 'user1关注user_2',
  PRIMARY KEY (`user1_id`,`user2_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of focus
-- ----------------------------

-- ----------------------------
-- Table structure for recommend
-- ----------------------------
DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend` (
  `id` char(36) NOT NULL,
  `user_id` char(11) NOT NULL,
  `content` varchar(255) NOT NULL,
  `book_img` varchar(255) DEFAULT NULL,
  `book_title` varchar(25) DEFAULT NULL,
  `book_author` varchar(20) DEFAULT NULL,
  `look_num` int(11) unsigned zerofill DEFAULT '00000000000',
  `comment_num` int(11) unsigned zerofill DEFAULT '00000000000',
  `like_num` int(11) unsigned zerofill DEFAULT '00000000000',
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recommend
-- ----------------------------
INSERT INTO `recommend` VALUES ('0ce913c5-f32f-4f9a-a0c7-d94fdca74033', '18487292360', '人生总是一次又一次的目送，看着你的背影离开', '', '目送', '龙应台', null, null, null, '2017-04-15 10:12:03');
INSERT INTO `recommend` VALUES ('12ef0a7d-abb2-493a-b282-1b43d01da2b4', '18487292360', '好看～', null, null, null, null, null, null, '2017-04-14 12:00:47');
INSERT INTO `recommend` VALUES ('26736bfd-cb8c-4de3-a8d8-680f79b4cc94', '18487292360', '喜欢～', '21c95dcf-1570-4fc4-ba17-1d154e525b1a.jpg', '嫌疑人x', '东野圭吾', '00000000001', null, null, '2017-04-14 20:29:43');
INSERT INTO `recommend` VALUES ('2d43d0df-b3e4-4337-9cbb-04178a5b6408', '18487292360', '没有附件信息', '', '测试', '啦啦', null, null, null, '2017-04-15 10:17:53');
INSERT INTO `recommend` VALUES ('3b89aebf-25e4-46f3-94f0-f29a99d9b4c0', '18487292360', '哈哈哈', '2c27853d-b82f-4bfe-b950-577607f006d6.jpg', '测试', '他天天', null, null, null, '2017-04-15 09:56:36');
INSERT INTO `recommend` VALUES ('3cf338c7-8e0a-43a2-ac9d-64a1dad60dff', '18487292360', '第一次看是管春和毛毛的故事，毛毛说，“管春，我不会做生意，你可不可以养我...”，管春说“毛毛，我可以不可照顾你”...两个人经历了很多事之后很好在一起，这就很难得...', '9f6e2c95-6745-4178-989f-eb265b408851.jpg', '从你的全世界路过', '张嘉佳', null, null, null, '2017-04-14 21:30:41');
INSERT INTO `recommend` VALUES ('43faa855-c931-43a4-ab04-e0d4aa53c3be', '18487292360', '哈哈', '49209da6-575c-4f74-8af7-c21a53e8c1ad.jpg', '先休息', '是是是', null, null, null, '2017-04-14 20:56:56');
INSERT INTO `recommend` VALUES ('6ad29728-7425-4b16-ad42-aa64bdb8c10f', '18487292360', '好看好看呐～', '25dc4a86-bf0a-40ff-9a0e-2bf8a4ee7452.jpg', '白夜行', '东野圭吾', null, null, null, '2017-04-14 20:25:00');
INSERT INTO `recommend` VALUES ('7a8f733a-fa6b-4f80-aa37-981a4ee387d3', '18487292360', '我的天空没有太阳，总是黑夜，但并不暗，因为有东西代替了太阳……', 'c249a3a1-f689-4a8f-8489-310acbbe6863.jpg', '白夜行', '东野圭吾', null, null, null, '2017-04-14 20:19:34');
INSERT INTO `recommend` VALUES ('7e0b6c18-a7c7-4338-add5-c615101f263d', '18487292360', '喜欢短篇小故事，感觉很真实～', '1e3b2cbf-2cb8-425c-bdb6-9ea5c6dbafff.jpg', '从你的全世界路过', '张嘉佳', null, null, null, '2017-04-14 21:44:40');
INSERT INTO `recommend` VALUES ('99bfb9ef-a634-48a2-98fc-87eec8418e59', '18487292360', '深深的悲哀，看到最后只剩无奈，我反而希望永远不要破案，让两个罪人能在白夜中相依...', '47c7b410-c591-4b8e-8fc4-fd70b4b48630.jpg', '白夜行', '东野圭吾', null, null, null, '2017-04-14 20:13:53');
INSERT INTO `recommend` VALUES ('a3fd1ac9-f2c7-441c-815f-7c8e1de607a9', '18487292360', '静谧而舒缓', '196f3cb7-e6a1-4a7d-bf97-3ec2e8660ae2.jpg', '飘', 'xxx', null, null, null, '2017-04-14 20:34:31');
INSERT INTO `recommend` VALUES ('b80f9ba9-2d3e-4f6b-b104-4a9b4a1ce3d5', '18487292360', '违法非法人', null, null, null, null, null, null, '2017-04-13 16:18:42');
INSERT INTO `recommend` VALUES ('bff8f0a7-76ac-4e5e-9732-d5a733d7f679', '18487292360', '静谧而舒缓', '12f18fdc-d57c-4253-88c9-2031e7840cd3.jpg', '飘', 'xxx', null, null, null, '2017-04-14 20:39:29');
INSERT INTO `recommend` VALUES ('d876f0d9-f0ce-4be8-8467-a6d66cd74c8c', '18487292360', '哈哈～', '9fd3efed-0591-4403-bf29-27227be9a186.jpg', 'head fiest', 'xxx', null, null, null, '2017-04-14 21:01:41');
INSERT INTO `recommend` VALUES ('e123b66d-4517-4235-a5b0-84536160883f', '18487292360', '好好', 'fc4c16d0-d2d7-4ac9-aec7-20083ad71b17.jpg', '测试', 'test', null, null, null, '2017-04-15 10:05:50');
INSERT INTO `recommend` VALUES ('f3d20e3e-1e43-4f50-a93b-457bc75e44e6', '18487292365', '第一次看是管春和毛毛的故事，毛毛说，“管春，我不会做生意，你可不可以养我...”，管春说“毛毛，我可以不可照顾你”...两个人经历了很多事之后很好在一起，这就很难得...', 'b59b1654-524b-439d-949f-41592476122d.jpg', '从你的全世界路过', '张嘉佳', null, null, null, '2017-04-14 21:35:32');

-- ----------------------------
-- Table structure for theme
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme` (
  `id` char(36) NOT NULL,
  `user_id` char(11) NOT NULL,
  `title` varchar(40) NOT NULL,
  `subtitle` varchar(40) DEFAULT NULL,
  `describe` text NOT NULL,
  `subscribe_info` text COMMENT '订阅须知',
  `suit_sb` varchar(255) DEFAULT NULL COMMENT '适应人群',
  `hot` int(11) unsigned zerofill DEFAULT NULL COMMENT '热度，有多少人订阅',
  `theme_img` varchar(255) DEFAULT NULL COMMENT '专栏图片',
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of theme
-- ----------------------------
INSERT INTO `theme` VALUES ('137de17b-943d-44dc-a435-de7ad725535d', '18487292360', '惟有兰花香正好', '生活只愿一直这样', '如果有一天，或者现在，你觉得自己是走了弯路。那么，首先，我要恭喜你，你现在一定是已经到了最初设定的目的地了，或者是找到了一条可能正确的路，不然，你是如何知道自己走了弯路的呢？可怕的永远不是弯路，而是原地踏步。弯路中的点点滴滴都会是原地踏步无所企及的收获。\n\n所谓的弯路，不过是自己没有想通而已。静下心来，闭上眼睛，回忆感受一下那些所谓的弯路带给我们的不同寻常。​\n\n也许，我们还都走在抵达梦想的弯路上，不要着急，只要初心还在，不断纠偏路径，总有那么一天的。', '唐氏鸡汤，一喝三大碗。', '一直不放过自己的你们。', '00000000000', 'f50eeb15-7347-4769-bcdc-277dc566c178.jpg', '2017-04-21 17:26:06');
INSERT INTO `theme` VALUES ('5e355cf8-c16c-4e34-a387-57ab23ef5547', '18487292360', '六十亿个世界和一个你', '你对我来说是独一无二的一个', '给你讲个故事，我想故事里只有你我，再也 没有其他人，其他故事作为穿插，但我希望 你永远别当真。\n\n讲一段故事，你不要当真。 走一程山水，你不要回头。\n\n我后来一个人晚睡山中，漫坡虫鸣，我的眼 睛闭着，心还醒着。 给我一杯沧桑，我会对月饮尽成空。', '不定期更新。\n身边的故事都在这里。', '', '00000000000', 'fb41634c-c7ba-44e0-a0ad-80fe53f6b158.jpg', '2017-04-21 17:06:22');
INSERT INTO `theme` VALUES ('6786570c-718f-4058-8fea-b64e97800435', '18487292360', '向鱼问水，向马问路', '给你一张安安静静的书桌', '也许一个人最好的样子就是静一点，哪怕一个人生活，穿越一个又一个城市，走过一条又一条街，仰望一片又一片天空，见证一场又一场离别，于是终于可以坦然的说，我终于不那么执着。', '定期更新，每周至少更新一千字。', '温柔的我和你。', '00000000000', 'cd00cf06-cd6f-4fe9-b52f-3b3a6829846b.jpg', '2017-04-21 16:36:01');
INSERT INTO `theme` VALUES ('8ef8c6bc-a355-4583-96b0-c66071976fc9', '18487292365', '测试', '测试', '测试专栏简介', '凄凄切切', '呜呜呜呜', '00000000000', '', '2017-04-21 15:41:53');
INSERT INTO `theme` VALUES ('93066a01-b4e6-47e0-8a0b-a3f8869b1cc2', '18487292360', '诗歌远去', '有诗，有歌，有江上明月，有一汪清源。', '阿碧，我的灵魂在南方剧烈枯竭，梦想如叶摇晃。﻿\n\n阿碧，中原郑州的冬天，好像很冷，好像又不冷。﻿﻿﻿\n\n阿碧，等我阅尽悲欢，浮沉和兴亡浩荡。﻿\n\n阿碧，佛陀在雨里不撑伞，山河度故人。﻿﻿\n\n阿碧，布达拉宫前的风马旗，收纳不了一口袋的星辰。﻿\n\n阿碧，大昭寺的桑烟，进了我的眼，呛死了一匹白马。﻿﻿﻿\n\n阿碧，我已经尘满面，心满霜，恐怕不能如孩童时对你笑了。﻿\n\n阿碧，我晚睡的时候，比早睡安稳，我停笔如耕，如农视田。﻿﻿﻿\n\n阿碧，彩霞满天的时候，我常常在岸边风里，等你回来。﻿﻿﻿﻿\n\n阿碧，我是一颗不愿别人切割的翡翠原石，固执又倔强。﻿\n\n阿碧，我要的不是收藏，而是滩涂的自由，有饮水的马，有游曳的鱼，有累了歇脚的雁。', '', '生活路上的归途人。', '00000000000', '9020f076-3ef1-4a5f-859e-0b0eeabe3ff3.jpg', '2017-04-21 17:13:29');
INSERT INTO `theme` VALUES ('fd62dd7a-3ef0-4be4-adc3-87be550d5069', '18487292360', '这世界，有人不一样', '借我豪情如旧时，花开花落皆是诗', '我有我固执一海独游，不愿上岸，抵死以达的美丽航线。我有我荒野独行，不肯作伴的清醒自乐的不羁洒脱。我有我深夜不寐，只因夜宁如香的平和和幸福。\n\n你我本是不同原野驰骋的两匹马，寻常饮水而识，你有你的方向，我有我的张望。你我无论谁弃了远方困于一隅，都会短暂平和宁静下暗生出波涛，最后掀起海啸。', '只收奇葩文，不奇葩不收。\n不定期更新，随心而已。', '如果有情节让你产生共鸣，感受世界的温柔。', '00000000000', 'e773bd91-2f4e-45e0-85f8-3f360f1973cc.jpg', '2017-04-21 16:56:00');

-- ----------------------------
-- Table structure for theme_article
-- ----------------------------
DROP TABLE IF EXISTS `theme_article`;
CREATE TABLE `theme_article` (
  `id` char(36) NOT NULL,
  `user_id` char(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `content` text NOT NULL,
  `look_num` int(11) unsigned zerofill DEFAULT NULL,
  `like_num` int(11) unsigned zerofill DEFAULT NULL,
  `article_img` varchar(255) DEFAULT NULL,
  `theme_id` char(36) NOT NULL,
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of theme_article
-- ----------------------------
INSERT INTO `theme_article` VALUES ('1978e4a5-b378-47fa-a0bc-de3dae04e555', '18487292360', '白夜行：有种恶，无法救赎，也无从终结', '不管是雪穗，还是桐原，他们的恶行，都无法被救赎，也无法终止，除非他们在这个世界上消失。\n\n无法被救赎，是因为没有人能走进他们深沉而黑暗的世界。\n\n无法终止，是因为他们不允许，也不能让别人看到他们的黑暗世界。\n\n生活在黑暗中，是他们的悲剧性命运使然。\n\n而造成他们命运悲剧的，又是我们社会里其他人的恶行。他们是恶之花，更是恶之果。\n\n深刻的悲剧，不仅在于我们能够理解他人命运之乖张颠簸，让我们能感同身受，更在于让我们洞察到酿成悲剧的人类固有的人性缺憾，使我们在面对这个世界时，能够多一份明悟，多一丝慈悲。', null, null, 'fa7c3068-ae80-4a14-aaa9-03c4538a2390.jpg', '6786570c-718f-4058-8fea-b64e97800435', '2017-04-21 20:26:06');
INSERT INTO `theme_article` VALUES ('29575986-89db-4881-8c0b-751bb8a248b9', '18487292360', '她来时有风', '我所希冀的生活不是成为诗，而是在每一个温柔的清晨睡到自然醒。拉开窗帘是洒满整个古城的阳光。我们三五成群，骑着电动车环绕过一条又一条小巷，依海而歌，头顶着日光写作。', null, null, 'da3f190e-7713-41a9-a29c-77032e5c0f08.jpg', '6786570c-718f-4058-8fea-b64e97800435', '2017-04-21 19:26:06');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` char(11) NOT NULL,
  `password` varchar(16) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT '0',
  `regist_time` datetime NOT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `resume` varchar(255) DEFAULT NULL COMMENT '个人简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('18487292360', 'zjl19950601', 'zero', null, '0', '2017-03-08 22:50:31', null, null);
INSERT INTO `user` VALUES ('18487292365', '123123', 'zzz', null, '0', '2017-04-12 14:20:37', '2017-04-12 14:20:38', null);
INSERT INTO `user` VALUES ('18587292360', 'zjl19950601', 'test', null, '0', '2017-04-07 00:32:53', null, null);
