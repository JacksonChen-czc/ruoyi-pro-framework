package cn.chenzecheng.ruoyi.framework.tech.apilog.core.service;

import org.springframework.scheduling.annotation.Async;

/**
 * API 错误日志 Framework Service 实现类
 * <p>
 * 基于 {@link ApiErrorLogApi} 服务，记录错误日志
 *
 * @author 芋道源码
 */
//@RequiredArgsConstructor
public class ApiErrorLogFrameworkServiceImpl implements ApiErrorLogFrameworkService {

//    private final ApiErrorLogApi apiErrorLogApi;

    @Override
    @Async
    public void createApiErrorLog(ApiErrorLog apiErrorLog) {
        // TODO: 2022/11/6  依赖infra
//        ApiErrorLogCreateReqDTO reqDTO = BeanUtil.copyProperties(apiErrorLog, ApiErrorLogCreateReqDTO.class);
//        apiErrorLogApi.createApiErrorLog(reqDTO);
    }

}
