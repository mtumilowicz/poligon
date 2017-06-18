package problems.enums;

import com.google.common.collect.ImmutableList;

import java.util.Arrays;

/**
 * Created by mtumilowicz on 2017-06-17.
 */
public enum OrderStatus {
    
    NEW {
        @Override
        public ImmutableList<OrderStatus> getNextStatus() {
            return ImmutableList.copyOf(Arrays.asList(IN_PROGRESS, REJECTED));
        }
    },
    IN_PROGRESS {
        @Override
        public ImmutableList<OrderStatus> getNextStatus() {
            return ImmutableList.copyOf(Arrays.asList(FILLED, REJECTED));
        }
    },
    FILLED {
        @Override
        public ImmutableList<OrderStatus> getNextStatus() {
            return ImmutableList.copyOf(Arrays.asList(CLOSED));
        }
    },
    CLOSED {
        @Override
        public ImmutableList<OrderStatus> getNextStatus() {
            return ImmutableList.of();
        }
    },
    REJECTED {
        @Override
        public ImmutableList<OrderStatus> getNextStatus() {
            return ImmutableList.of();
        }
    };
    
    public abstract ImmutableList<OrderStatus> getNextStatus();
    
    public boolean isPossible(OrderStatus status) {
        return getNextStatus().contains(status);
    }
}
