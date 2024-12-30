### 1. **What is Git, and why is it used?**

**Answer:** Git is a distributed version control system that helps developers track and manage changes to source code during software development. It allows multiple developers to collaborate on a project by enabling branching, merging, and maintaining a history of commits. It’s widely used due to its scalability, flexibility, and support for distributed teams.

### 2. **Explain the difference between Git and GitHub.**

**Answer:**

- **Git**: A version control system to manage source code history locally or on a server.
- **GitHub**: A cloud-based hosting service that allows developers to store their Git repositories online. It adds collaboration features like pull requests, issue tracking, and project management.

### 3. **What are the different states of a file in Git?**

**Answer:** A file in Git can be in one of the following states:

- **Untracked**: The file exists in the directory but hasn’t been added to Git.
- **Modified**: The file has been changed but not yet staged.
- **Staged**: The file has been marked to be included in the next commit.
- **Committed**: The file has been saved in the local Git repository.

### 4. **How do you initialize a Git repository?**

**Answer:** To initialize a Git repository, navigate to your project folder and run the command:
`git init`

This creates a `.git` directory, which contains all the metadata for the repository.

### 5. **Explain the concept of branching in Git.**

**Answer:** Branching allows developers to create independent lines of development within a project. A **branch** is a pointer to a commit that developers can work on independently without affecting the main codebase. For example, the `master` or `main` branch is usually the default branch, while developers can create feature-specific or bug-fix branches.

To create a new branch:
`git branch <branch_name>`

### 6. **How do you merge two branches in Git?**

**Answer:** To merge one branch into another, follow these steps:

1. Switch to the branch you want to merge into (e.g., `main`):
    
    `git checkout main`
    
2. Run the merge command:

    `git merge <branch_name>`
    

Git will attempt to combine changes from the other branch into the current branch. If there are no conflicts, it will merge automatically.

### 7. **What is a merge conflict, and how do you resolve it?**

**Answer:** A merge conflict occurs when Git cannot automatically merge changes between branches because changes were made to the same part of a file. Git will mark the conflict area, and you will need to manually edit the file to resolve the conflict.

To resolve a conflict:

- Open the conflicted file and look for the conflict markers (`<<<<<<`, `======`, `>>>>>>`).
- Edit the file to combine the changes or choose one set of changes.
- After resolving the conflict, mark the file as resolved:

    `git add <filename>`
    
- Commit the changes:

    `git commit`
    

### 8. **What is the difference between `git pull` and `git fetch`?**

**Answer:**

- **`git fetch`**: Downloads commits, files, and refs from a remote repository into your local repository but does not merge the changes. It updates your remote tracking branches.
- **`git pull`**: Combines `git fetch` and `git merge` in one step. It fetches changes from the remote repository and directly merges them into your current branch.

### 9. **What is a rebase in Git?**

**Answer:** Rebasing is a way to move or combine a sequence of commits to a new base commit. It rewrites the commit history and is often used to make the commit history cleaner and more linear.

`git rebase <branch_name>`

### 10. **How do you undo the last commit in Git?**

**Answer:** To undo the last commit without losing the changes made in the working directory:

`git reset --soft HEAD~1`

To undo the last commit and discard the changes:

`git reset --hard HEAD~1`

### 11. **What is a Git stash?**

**Answer:** The `git stash` command temporarily shelves (or stashes) changes that are not ready to be committed. This allows you to work on something else without losing your progress. You can retrieve the stashed changes later using:

`git stash pop`

### 12. **What is a ‘detached HEAD’ in Git?**

**Answer:** A detached HEAD state occurs when you are not on a branch, but on a specific commit, tag, or another reference. Any commits made in this state will not be associated with any branch unless explicitly moved.

### 13. **How can you find a specific commit in Git?**

**Answer:** You can find a specific commit by its commit hash, using the following command:

`git log`

The `git log` command will display a list of commits, including the commit hashes, authors, and commit messages.

### 14. **What is the difference between `git rebase` and `git merge`?**

**Answer:**

- **`git merge`**: Combines two branches and creates a merge commit.
- **`git rebase`**: Re-applies commits from a branch on top of another base branch, resulting in a linear history without a merge commit.

### 15. **How can you squash commits in Git?**

**Answer:** Squashing commits means combining multiple commits into one. This is often used to tidy up a branch’s history before merging.

To squash commits during a rebase:

`git rebase -i HEAD~n`

In the interactive editor, mark the commits to be squashed with `s` (squash), then save and close the editor.