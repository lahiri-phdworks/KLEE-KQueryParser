(set-logic QF_AUFBV )
(declare-fun const_arr1 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym0 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym1 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym2 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym3 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym4 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym5 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun fsym6 () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun i () (Array (_ BitVec 32) (_ BitVec 8) ) )
(declare-fun x () (Array (_ BitVec 32) (_ BitVec 8) ) )
(assert (=  (select const_arr1 (_ bv0 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv1 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv2 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv3 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv4 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv5 32) ) (_ bv0 8) ) )
(assert (=  (select const_arr1 (_ bv6 32) ) (_ bv0 8) ) )
(assert (let ( (?B1 (select  i (_ bv0 32) ) ) (?B2 (select  fsym0 (_ bv0 32) ) ) (?B3 (select  fsym1 (_ bv0 32) ) ) (?B4 (select  fsym2 (_ bv0 32) ) ) (?B5 (select  fsym3 (_ bv0 32) ) ) (?B6 (select  fsym4 (_ bv0 32) ) ) (?B7 (select  fsym5 (_ bv0 32) ) ) (?B8 (select  fsym6 (_ bv0 32) ) ) ) (let ( (?B9 ((_ zero_extend 24)  ?B1 ) ) (?B11 ((_ zero_extend 24)  ?B4 ) ) (?B10 ((_ zero_extend 24)  ?B3 ) ) (?B14 ((_ zero_extend 24)  ?B7 ) ) (?B13 ((_ zero_extend 24)  ?B6 ) ) (?B12 ((_ zero_extend 24)  ?B5 ) ) ) (and  (and  (and  (and  (and  (and  (and  (and  (and  (and  (and  (bvslt  ?B10 ((_ zero_extend 24)  ?B2 ) ) (=  false (bvslt  ?B11 ?B10 ) ) ) (bvslt  ?B12 ?B11 ) ) (=  false (bvslt  ?B13 ?B12 ) ) ) (=  false (bvslt  ?B14 ?B13 ) ) ) (bvslt  ((_ zero_extend 24)  ?B8 ) ?B14 ) ) (=  (_ bv3 64) (concat  (select  x (_ bv7 32) ) (concat  (select  x (_ bv6 32) ) (concat  (select  x (_ bv5 32) ) (concat  (select  x (_ bv4 32) ) (concat  (select  x (_ bv3 32) ) (concat  (select  x (_ bv2 32) ) (concat  (select  x (_ bv1 32) ) (select  x (_ bv0 32) ) ) ) ) ) ) ) ) ) ) (bvsle  (_ bv0 32) ?B9 ) ) (bvsle  ?B9 (_ bv6 32) ) ) (bvsle  ?B9 (_ bv3 32) ) ) (=  false (bvslt  ?B12 ((_ zero_extend 24)  (select  (store  (store  (store  (store  (store  (store  (store  const_arr1 (_ bv0 32) ?B2 ) (_ bv1 32) ?B3 ) (_ bv2 32) ?B4 ) (_ bv3 32) ?B5 ) (_ bv4 32) ?B6 ) (_ bv5 32) ?B7 ) (_ bv6 32) ?B8 ) ((_ extract 31  0)  ((_ zero_extend 56)  ?B1 ) ) ) ) ) ) ) (=  false (bvsle  ?B9 (_ bv2 32) ) ) ) ) ) )
(check-sat)
(exit)
