package com.erbantou;

import com.erbantou.dto.IncomeStatisticsDto;
import com.erbantou.utils.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ivan on 2018/08/21 16:00:00
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ExportExcelIncomeStatisticsTest {

    @Test
    public void test() throws Exception {
        List<IncomeStatisticsDto> list = getTestList();

        Map<String, String> map = new HashMap<>();

        String template = "精英学院收入统计报表.xls";
        FileOutputStream fos = new FileOutputStream("精英学院收入统计报表-auto.xls");

        ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, template, fos, list, IncomeStatisticsDto.class, true);
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(new Date());
    }

    private List<IncomeStatisticsDto> getTestList() {
        List<IncomeStatisticsDto> list = new ArrayList<>();

        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文AAA", "AAA",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "取消", "N",
                0, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文BBB", "BBB",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "正常", "Y",
                1880.00, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文CCC", "CCC",
                "基础老师培训", "8月", "北京",
                1, 0, 0,
                "免费名额", "正常", "Y",
                0, "", "2018/8/11 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文DDD", "DDD",
                "基础老师培训", "8月", "北京",
                0, 1880.00, 0,
                "余额支付", "3日内退训", "N",
                0, "", "2018/8/12 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("河北廊坊中心", "中文EEE", "EEE",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "中途退训", "Y",
                1880.00, "", "2018/8/13 11:00:20",
                "报名参加一人", 504L, "4133201808061112430331773340"));
        list.add(new IncomeStatisticsDto("河北石家庄中心", "中文FFF", "FFF",
                "基础老师培训", "8月", "北京",
                0, 200.00, 1680.00,
                "现金支付", "取消（不退还）", "Y",
                1880.00, "", "2018/8/14 11:00:20",
                "报名参加一人", 505L, "4133201808061111031248177096"));

        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文AAA", "AAA",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "取消", "N",
                0, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文BBB", "BBB",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "正常", "Y",
                1880.00, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文CCC", "CCC",
                "基础老师培训", "8月", "北京",
                1, 0, 0,
                "免费名额", "正常", "Y",
                0, "", "2018/8/11 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文DDD", "DDD",
                "基础老师培训", "8月", "北京",
                0, 1880.00, 0,
                "余额支付", "3日内退训", "N",
                0, "", "2018/8/12 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("河北廊坊中心", "中文EEE", "EEE",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "中途退训", "Y",
                1880.00, "", "2018/8/13 11:00:20",
                "报名参加一人", 504L, "4133201808061112430331773340"));
        list.add(new IncomeStatisticsDto("河北石家庄中心", "中文FFF", "FFF",
                "基础老师培训", "8月", "北京",
                0, 200.00, 1680.00,
                "现金支付", "取消（不退还）", "Y",
                1880.00, "", "2018/8/14 11:00:20",
                "报名参加一人", 505L, "4133201808061111031248177096"));

        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文AAA", "AAA",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "取消", "N",
                0, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津塘沽中心", "中文BBB", "BBB",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "正常", "Y",
                1880.00, "", "2018/8/10 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文CCC", "CCC",
                "基础老师培训", "8月", "北京",
                1, 0, 0,
                "免费名额", "正常", "Y",
                0, "", "2018/8/11 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("天津开发区中心", "中文DDD", "DDD",
                "基础老师培训", "8月", "北京",
                0, 1880.00, 0,
                "余额支付", "3日内退训", "N",
                0, "", "2018/8/12 11:00:20",
                "两家中心报名参加", 502L, "4133201808061112498502731965"));
        list.add(new IncomeStatisticsDto("河北廊坊中心", "中文EEE", "EEE",
                "基础老师培训", "8月", "北京",
                0, 0, 1880.00,
                "现金支付", "中途退训", "Y",
                1880.00, "", "2018/8/13 11:00:20",
                "报名参加一人", 504L, "4133201808061112430331773340"));
        list.add(new IncomeStatisticsDto("河北石家庄中心", "中文FFF", "FFF",
                "基础老师培训", "8月", "北京",
                0, 200.00, 1680.00,
                "现金支付", "取消（不退还）", "Y",
                1880.00, "", "2018/8/14 11:00:20",
                "报名参加一人", 505L, "4133201808061111031248177096"));

        return list;
    }
}
