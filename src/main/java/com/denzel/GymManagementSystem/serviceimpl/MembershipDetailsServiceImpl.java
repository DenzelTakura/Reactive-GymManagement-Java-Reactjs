package com.denzel.GymManagementSystem.serviceimpl;

import com.denzel.GymManagementSystem.model.MembershipDetails;
import com.denzel.GymManagementSystem.repository.MembershipdetailsRepo;
import com.denzel.GymManagementSystem.service.MembershipDetailsService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class MembershipDetailsServiceImpl implements MembershipDetailsService {
    @Override
    public Mono<MembershipDetails> save(MembershipDetails membershipDetails) {
        return null;
    }

    @Override
    public Flux<MembershipDetails> findAll() {
        return null;
    }

    @Override
    public Mono<MembershipDetails> getById(Long id) {
        return null;
    }
}
