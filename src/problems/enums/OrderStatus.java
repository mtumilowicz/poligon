package problems.enums;

import com.google.common.collect.ImmutableSet;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-06-17.
 */
public enum OrderStatus {
    
    NEW {
        @Override
        public ImmutableSet<OrderStatus> getNextStatuses() {
            return ImmutableSet.copyOf(Arrays.asList(IN_PROGRESS, REJECTED));
        }
    },
    IN_PROGRESS {
        @Override
        public ImmutableSet<OrderStatus> getNextStatuses() {
            return ImmutableSet.copyOf(Arrays.asList(FILLED, REJECTED));
        }
    },
    FILLED {
        @Override
        public ImmutableSet<OrderStatus> getNextStatuses() {
            return ImmutableSet.copyOf(Arrays.asList(CLOSED));
        }
    },
    CLOSED {
        @Override
        public ImmutableSet<OrderStatus> getNextStatuses() {
            return ImmutableSet.of();
        }
    },
    REJECTED {
        @Override
        public ImmutableSet<OrderStatus> getNextStatuses() {
            return ImmutableSet.of();
        }
    };
    
    public abstract ImmutableSet<OrderStatus> getNextStatuses();
    
    public boolean isPossible(OrderStatus status) {
        return getNextStatuses().contains(status);
    }
}
