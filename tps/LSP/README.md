# Liskov Substitution Principle (LSP) :

**Problem**: `Ostrich` class violates `LSP` because it can't be substituted for `Bird`.

**Solution**:replacing `fly` with more generic method like `move`, adhering to `LSP`. Now Ostrich can be substituted for `Bird` without issues.