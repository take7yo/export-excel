package com.erbantou.dto;

import com.erbantou.utils.ExcelResources;

/**
 * Created by Ivan
 */
public class IncomeStatisticsDto {

    // 中心名称
    private String centerName;

    // 学员姓名（中文）
    private String nameCn;

    // 学员姓名（英文）
    private String nameEn;

    // 培训对象
    private String topics;

    // 培训时间
    private String trainingMonth;

    // 培训地点
    private String location;

    // 免费名额
    private Integer freeQuotaNumber;

    // 余额支付
    private double balanceAmount;

    // 转账金额
    private double cashAmount;

    // 支付类型
    private String payWay;

    // 培训状态
    private String trainingStatus;

    // 是否耗课
    private String isConsumed;

    // 耗课收入
    private double consumedAmount;

    // 培训结果
    private String trainingResult;

    // 交易时间
    private String tradingTime;

    // 付款附言
    private String memo;

    // 订单号
    private Long orderId;

    // 商户订单号
    private String billNo;

    public IncomeStatisticsDto(String centerName, String nameCn, String nameEn, String topics, String trainingMonth,
                               String location, Integer freeQuotaNumber, double balanceAmount, double cashAmount,
                               String payWay, String trainingStatus, String isConsumed, double consumedAmount,
                               String trainingResult, String tradingTime, String memo, Long orderId, String billNo) {
        this.centerName = centerName;
        this.nameCn = nameCn;
        this.nameEn = nameEn;
        this.topics = topics;
        this.trainingMonth = trainingMonth;
        this.location = location;
        this.freeQuotaNumber = freeQuotaNumber;
        this.balanceAmount = balanceAmount;
        this.cashAmount = cashAmount;
        this.payWay = payWay;
        this.trainingStatus = trainingStatus;
        this.isConsumed = isConsumed;
        this.consumedAmount = consumedAmount;
        this.trainingResult = trainingResult;
        this.tradingTime = tradingTime;
        this.memo = memo;
        this.orderId = orderId;
        this.billNo = billNo;
    }

    public IncomeStatisticsDto() {
    }

    @Override
    public String toString() {
        return "IncomeStatisticsDto{" +
                "centerName='" + centerName + '\'' +
                ", nameCn='" + nameCn + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", topics='" + topics + '\'' +
                ", trainingMonth=" + trainingMonth + '\'' +
                ", location=" + location + '\'' +
                ", freeQuotaNumber=" + freeQuotaNumber + '\'' +
                ", balanceAmount=" + balanceAmount + '\'' +
                ", cashAmount=" + cashAmount + '\'' +
                ", payWay=" + payWay + '\'' +
                ", trainingStatus=" + trainingStatus + '\'' +
                ", isConsumed=" + isConsumed + '\'' +
                ", consumedAmount=" + consumedAmount + '\'' +
                ", trainingResult=" + trainingResult + '\'' +
                ", tradingTime=" + tradingTime + '\'' +
                ", memo=" + memo + '\'' +
                ", orderId=" + orderId + '\'' +
                ", billNo=" + billNo +
                '}';
    }

    @ExcelResources(title = "中心名称", order = 1)
    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    @ExcelResources(title = "学员姓名（中文）", order = 2)
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    @ExcelResources(title = "学员姓名（英文）", order = 3)
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @ExcelResources(title = "培训课程", order = 4)
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    @ExcelResources(title = "参训时间", order = 5)
    public String getTrainingMonth() {
        return trainingMonth;
    }

    public void setTrainingMonth(String trainingMonth) {
        this.trainingMonth = trainingMonth;
    }

    @ExcelResources(title = "培训地点", order = 6)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @ExcelResources(title = "免费名额", order = 7)
    public Integer getFreeQuotaNumber() {
        return freeQuotaNumber;
    }

    public void setFreeQuotaNumber(Integer freeQuotaNumber) {
        this.freeQuotaNumber = freeQuotaNumber;
    }

    @ExcelResources(title = "余额支付", order = 8)
    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @ExcelResources(title = "转账支付", order = 9)
    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    @ExcelResources(title = "支付类型", order = 10)
    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @ExcelResources(title = "培训状态", order = 11)
    public String getTrainingStatus() {
        return trainingStatus;
    }

    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    @ExcelResources(title = "是否耗课（Y/N）", order = 12)
    public String getIsConsumed() {
        return isConsumed;
    }

    public void setIsConsumed(String isConsumed) {
        this.isConsumed = isConsumed;
    }

    @ExcelResources(title = "耗课收入", order = 13)
    public double getConsumedAmount() {
        return consumedAmount;
    }

    public void setConsumedAmount(double consumedAmount) {
        this.consumedAmount = consumedAmount;
    }

    @ExcelResources(title = "培训结果", order = 14)
    public String getTrainingResult() {
        return trainingResult;
    }

    public void setTrainingResult(String trainingResult) {
        this.trainingResult = trainingResult;
    }

    @ExcelResources(title = "交易时间", order = 15)
    public String getTradingTime() {
        return tradingTime;
    }

    public void setTradingTime(String tradingTime) {
        this.tradingTime = tradingTime;
    }

    @ExcelResources(title = "付款附言", order = 16)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @ExcelResources(title = "订单号", order = 17)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @ExcelResources(title = "商户订单号", order = 18)
    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }
}
