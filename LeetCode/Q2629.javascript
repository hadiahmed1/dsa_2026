// Q2629. Function Composition

// Runtime 102 ms Beats 6.58%
// Memory 57.5 MB Beats 5.68%

/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(fns) {
    
    return function(x) {
        let ans = x
        for(let i = fns.length -1;i>=0;i--) {
            ans = fns[i](ans);
            console.log(ans);
        }
        return ans;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
