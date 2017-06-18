package problems.enums;

import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * Created by mtumilowicz on 2017-06-17.
 */
public enum OrderStatus {
    
    NEW {
        @Override
        public void putNextStatusesInCache() {
            nextStatusesCache.put(this, ImmutableSet.copyOf(Arrays.asList(IN_PROGRESS, REJECTED)));
        }
    },
    IN_PROGRESS {
        @Override
        public void putNextStatusesInCache() {
            nextStatusesCache.put(this, ImmutableSet.copyOf(Arrays.asList(FILLED, REJECTED)));
        }
    },
    FILLED {
        @Override
        public void putNextStatusesInCache() {
            nextStatusesCache.put(this, ImmutableSet.copyOf(Arrays.asList(CLOSED)));
        }
    },
    CLOSED {
        @Override
        public void putNextStatusesInCache() {
            nextStatusesCache.put(this, ImmutableSet.of());
        }
    },
    REJECTED {
        @Override
        public void putNextStatusesInCache() {
            nextStatusesCache.put(this, ImmutableSet.of());
        }
    };
    
    public static final Map<OrderStatus, ImmutableSet<OrderStatus>> nextStatusesCache = new EnumMap<>(OrderStatus.class);
    
    public ImmutableSet<OrderStatus> getNextStatuses() {
        if (nextStatusesCache.get(this) == null) {
            putNextStatusesInCache();
        }
        return nextStatusesCache.get(this);
    }
    
    public abstract void putNextStatusesInCache();
    
    public boolean isPossible(OrderStatus status) {
        return nextStatusesCache.get(this).contains(status);
    }
}
