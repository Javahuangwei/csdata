## 行业基础库- TOPS终端



### 简介

### 作为行业基础库的数据前端，整体架构采用前后端分离的技术。前端使用vue框架，后端使用springcloud框架，数据来源于数仓并通过三方API来提供。目前项目主要包括以下几部分：

- 市场概览
- 监管视图
    - 上市公司统计视图
    - 上市公司详情视图
- 档案检索
    - 企业
    - 人物
    - 产品
- 业务专题
    - 股票质押
    - 解禁减持
    - 债券专题
    - 证券市场与期货相关信息
- 数据分析
    - 指标灵活查询
    - 指标通用查询
    - 债券市场统计

### 项目结构

TOPS终端微服务源码按照父子项目组织，根项目包含6个一级子项目：

- tops-dap-gateway  API网关

- tops-dap-business 业务层（服务调用方，业务相关），是子系统后端服务入口

    - tops-dap-stockPledge 股票质押业务层

    - tops-dap-bond  债券相关业务层

    - tops-dap-archivesRetrieval 档案检索业务层

    - tops-dap-future 证券市场与期货相关信息业务层

    - tops-dap-liftBanReduce 解禁减持业务层

    - 再补充……
    
- tops-dao-api 微服务接口项目
    - tops-dap-systemApi   个人中心db层相关api
    - 再补充……
    
- tops-dap-system          个人中心（服务调用方）
- tops-dap-db              服务提供方集合
    - tops-dap-systemdb    个人中心（服务提供方）
    - 再补充……
    
- tops-dap-comp 微服务相关组件以及一些通用依赖项目
    - tops-dap-admin      服务监控
    - tops-dap-core      定义一些服务响应基类等公共类、通用工具类，是一个自定义的依赖包
    - tops-dap-redis     redis依赖包
    - tops-dap-swagger   swagger依赖包
    - tops-dap-xxljob    任务调度
    - 再补充……
    
###注意事项
鉴于业务数据由三方api来提供，这里我们的业务服务只设计到business层，也就是说业务层目前的服务提供方为三方api
