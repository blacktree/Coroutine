package com.nepxion.coroutine.common.thread;

/**
 * <p>Title: Nepxion Coroutine</p>
 * <p>Description: Nepxion Coroutine For Distribution</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email 1394997@qq.com
 * @version 1.0
 */

public enum ThreadRejectedPolicyType {
    BLOCKING_POLICY_WITH_REPORT("BlockingPolicyWithReport"),
    CALLER_RUNS_POLICY_WITH_REPORT("CallerRunsPolicyWithReport"),
    ABORT_POLICY_WITH_REPORT("AbortPolicyWithReport"),
    REJECTED_POLICY_WITH_REPORT("RejectedPolicyWithReport"),
    DISCARDED_POLICY_WITH_REPORT("DiscardedPolicyWithReport");

    private String value;

    private ThreadRejectedPolicyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ThreadRejectedPolicyType fromString(String value) {
        for (ThreadRejectedPolicyType type : ThreadRejectedPolicyType.values()) {
            if (type.getValue().equalsIgnoreCase(value.trim())) {
                return type;
            }
        }

        throw new IllegalArgumentException("Mismatched type with value=" + value);
    }

    @Override
    public String toString() {
        return value;
    }
}