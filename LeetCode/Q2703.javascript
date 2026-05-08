// Q2703. Return Length of Arguments Passed

// Runtime 50 ms Beats 17.48%
// Memory 54 MB Beats 17.09%

/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
