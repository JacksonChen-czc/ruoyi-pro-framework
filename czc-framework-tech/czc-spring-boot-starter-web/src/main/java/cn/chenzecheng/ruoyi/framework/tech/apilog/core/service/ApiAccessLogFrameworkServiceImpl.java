package cn.chenzecheng.ruoyi.framework.tech.apilog.core.service;

import org.springframework.scheduling.annotation.Async;

/**
 * API 访问日志 Framework Service 实现类
 * <p>
 * 基于 {@link ApiAccessLogApi} 服务，记录访问日志
 *
 * @author 芋道源码
 */
//@RequiredArgsConstructor
public class ApiAccessLogFrameworkServiceImpl implements ApiAccessLogFrameworkService {

//    private final ApiAccessLogApi apiAccessLogApi;

    @Override
    @Async
    public void createApiAccessLog(ApiAccessLog apiAccessLog) {
        // TODO: 2022/11/6  依赖infra
//        ApiAccessLogCreateReqDTO reqDTO = BeanUtil.copyProperties(apiAccessLog, ApiAccessLogCreateReqDTO.class);
//        apiAccessLogApi.createApiAccessLog(reqDTO);
    }

}
