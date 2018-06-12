package problems.set;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.apache.commons.collections4.SetUtils;

import java.util.AbstractList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mtumilowicz on 2018-06-10.
 */
public final class PowerSet {

    private PowerSet() {
    }

    public static final <E> Collection<Set<E>> of(Set<E> s) {
        Preconditions.checkArgument(s.size() <= 31, "Max size of PowerSet in java is bounded by Integer range");
        return ImmutableSet.copyOf(new PowerSetImplementation<>(s));
    }

    private static final class PowerSetImplementation<E> extends AbstractList<Set<E>> {

        private final ImmutableList<E> src;

        private PowerSetImplementation(Set<E> src) {
            this.src = ImmutableList.copyOf(SetUtils.emptyIfNull(src));
        }

        @Override
        public int size() {
            return 1 << src.size();
        }

        @Override
        public boolean contains(Object o) {
            return o instanceof Set && src.containsAll((Set) o);
        }

        @Override
        public Set<E> get(int index) {
            Set<E> result = new HashSet<>();
            for (int i = 0; index != 0; i++, index >>= 1)
                if ((index & 1) == 1)
                    result.add(src.get(i));
            return result;
        }
    }
}
